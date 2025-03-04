package org.form.shopservice.controller;

import org.form.shopservice.service.ShopService;
import org.form.shopservice.shopentity.ShopEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping("/all")
    public List<ShopEntity> getAllShops() {
        return shopService.getAllShops();
    }

    @PostMapping("/AddVeg")
    public ShopEntity AddVegetables(@RequestBody ShopEntity shopEntity) {
        return shopService.AddVegetables(shopEntity);
    }


}

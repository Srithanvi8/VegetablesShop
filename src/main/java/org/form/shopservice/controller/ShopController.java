package org.form.shopservice.controller;

import org.form.shopservice.dto.response.GenericResponseDTO;
import org.form.shopservice.service.ShopService;
import org.form.shopservice.Model.ShopEntity;
import org.springframework.beans.factory.annotation.Autowired;
//Star imports should not be used
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {

    //use parameterized constructor
    @Autowired
    private ShopService shopService;

//    @GetMapping("/all")
//    public List<ShopEntity> getAllShops() {
//        return shopService.getAllShops();
//    }

    @GetMapping("/all")
    public GenericResponseDTO<List<ShopEntity>> getAllShop() {
        return shopService.getAllShops();
    }


    //java naming terminology violation
    // consistency missing urls one is lowercase another one is camel case
    @PostMapping("/AddVeg")
    public ShopEntity AddVegetables(@RequestBody ShopEntity shopEntity) {
        return shopService.AddVegetables(shopEntity);
    }


}

package org.form.shopservice.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.form.shopservice.dto.response.GenericResponseDTO;
import org.form.shopservice.service.ShopService;
import org.form.shopservice.Model.ShopEntity;
import org.springframework.beans.factory.annotation.Autowired;
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


    @PostMapping("/addvegetables")
    public GenericResponseDTO<ShopEntity> addVegetables(@RequestBody ShopEntity shopEntity) {
        return shopService.addVegetables(shopEntity);
    }

    @PutMapping("/editVegetables/{id}")
    public GenericResponseDTO<ShopEntity> editVegetables(@PathVariable Long id, @RequestBody ShopEntity shopEntity) {
        return shopService.editVegetables(id, shopEntity);
    }

    @DeleteMapping("/deleteVegetables/{id}")
    public GenericResponseDTO<String> deleteVegetables(@PathVariable Long id){
        return shopService.deleteVegetables((id));
    }

}

package org.form.shopservice.controller;

import org.form.shopservice.dto.response.GenericResponseDTO;
import org.form.shopservice.model.ShopEntity;
import org.form.shopservice.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Controller for handling vegetable related operations.
 * Created RESTful APIs to manage vegetables.
 */
@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

//    @GetMapping("/all")
//    public List<ShopEntity> getAllShops() {
//        return shopService.getAllShops();
//    }

    /**
     * Retrieves all available vegetable details in DB
     */
    @GetMapping("/all")
    public GenericResponseDTO<List<ShopEntity>> getAllShop() {
        return shopService.getAllShops();
    }

    /**
     * Adding new vegetable details
     */
    @PostMapping("/addvegetables")
    public GenericResponseDTO<ShopEntity> addVegetables(@RequestBody ShopEntity shopEntity) {
        return shopService.addVegetables(shopEntity);
    }

    /**
     * Updating existing vegetable  details
     */
    @PutMapping("/editVegetables/{id}")
    public GenericResponseDTO<ShopEntity> editVegetables(@RequestBody ShopEntity shopEntity) {
        return shopService.editVegetables(shopEntity);
    }

    /**
     * Deleting existing vegetable details
     */
    @DeleteMapping("/deleteVegetables/{id}")
    public GenericResponseDTO<String> deleteVegetables(@PathVariable Long id){
        return shopService.deleteVegetables((id));
    }
}

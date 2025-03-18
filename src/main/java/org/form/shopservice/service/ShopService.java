package org.form.shopservice.service;

import org.form.shopservice.model.ShopEntity;
import org.form.shopservice.dto.response.GenericResponseDTO;

import java.util.List;

/**
 * This is a service interface having all methods related to vegetables data
 */

public interface ShopService {
    /**
     *Created a method to retrieve all vegetables details
     */
    GenericResponseDTO<List<ShopEntity>> getAllShops();
    /**
     *Created a method to add vegetables
     */
    GenericResponseDTO<ShopEntity> addVegetables(ShopEntity shopEntity);
    /**
     *Created a method to update vegetables details
     */
    GenericResponseDTO<ShopEntity> editVegetables(ShopEntity shopEntity);
    /**
     *Created a method to delete vegetables details
     */
    GenericResponseDTO<String> deleteVegetables(Long id);
}

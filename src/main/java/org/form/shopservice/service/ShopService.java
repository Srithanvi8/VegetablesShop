package org.form.shopservice.service;

import org.form.shopservice.Model.ShopEntity;
import org.form.shopservice.dto.response.GenericResponseDTO;

import java.util.List;

public interface ShopService {
    /**
     * comments are important
     * @implSpec
     * */
    GenericResponseDTO<List<ShopEntity>> getAllShops();
    GenericResponseDTO<ShopEntity> addVegetables(ShopEntity shopEntity);
}

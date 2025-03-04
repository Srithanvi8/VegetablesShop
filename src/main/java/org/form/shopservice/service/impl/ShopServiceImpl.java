package org.form.shopservice.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.form.shopservice.dto.response.GenericResponseDTO;
import org.form.shopservice.service.ShopService;
import org.form.shopservice.dao.repo.ShopRepository;
import org.form.shopservice.Model.ShopEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopRepository shopRepository;


    @Override
    public GenericResponseDTO<List<ShopEntity>> getAllShops() {
        GenericResponseDTO<List<ShopEntity>> response;
        try {
            List<ShopEntity> details=shopRepository.findAll();
            response=new GenericResponseDTO<>(Boolean.TRUE,"data fetch",new Date(),details);
        }catch (Exception e){
            log.error(e.getMessage());
        }
    }

    @Override
    public ShopEntity AddVegetables(ShopEntity shopEntity) {
        return shopRepository.save(shopEntity);
    }
}

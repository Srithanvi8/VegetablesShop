package org.form.shopservice.Impl;

import org.form.shopservice.service.ShopService;
import org.form.shopservice.Model.dao.ShopRepository;
import org.form.shopservice.shopentity.ShopEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopRepository shopRepository;


    @Override
    public List<ShopEntity> getAllShops() {
        return shopRepository.findAll();
    }
}

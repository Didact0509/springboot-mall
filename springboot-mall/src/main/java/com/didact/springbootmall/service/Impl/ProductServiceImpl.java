package com.didact.springbootmall.service.Impl;

import com.didact.springbootmall.dao.ProductDao;
import com.didact.springbootmall.model.Product;
import com.didact.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}

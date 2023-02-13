package com.didact.springbootmall.dao;

import com.didact.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}

package com.didact.springbootmall.service;

import com.didact.springbootmall.dao.ProductDao;
import com.didact.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);
}

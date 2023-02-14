package com.didact.springbootmall.service;

import com.didact.springbootmall.dao.ProductDao;
import com.didact.springbootmall.dto.ProductRequest;
import com.didact.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}

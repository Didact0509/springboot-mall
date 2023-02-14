package com.didact.springbootmall.service;

import com.didact.springbootmall.constant.ProductCategory;
import com.didact.springbootmall.dao.ProductDao;
import com.didact.springbootmall.dto.ProductRequest;
import com.didact.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}

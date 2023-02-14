package com.didact.springbootmall.service;

import com.didact.springbootmall.dto.ProductQueryParams;
import com.didact.springbootmall.dto.ProductRequest;
import com.didact.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}

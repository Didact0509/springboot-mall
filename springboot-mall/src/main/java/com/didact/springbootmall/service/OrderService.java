package com.didact.springbootmall.service;

import com.didact.springbootmall.dto.CreateOrderRequest;
import com.didact.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}

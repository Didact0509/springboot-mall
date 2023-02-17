package com.didact.springbootmall.service;

import com.didact.springbootmall.dto.CreateOrderRequest;
import com.didact.springbootmall.dto.OrderQueryParams;
import com.didact.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}

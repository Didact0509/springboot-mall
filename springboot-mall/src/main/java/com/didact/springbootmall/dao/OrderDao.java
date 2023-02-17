package com.didact.springbootmall.dao;

import com.didact.springbootmall.dto.OrderQueryParams;
import com.didact.springbootmall.model.Order;
import com.didact.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}

package com.example.lethihongnhung.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lethihongnhung.entity.Order;
import com.example.lethihongnhung.entity.OrderDetail;

import java.util.List; // Thêm import này để dùng List

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<OrderDetail> findByOrderId(int orderId);
}

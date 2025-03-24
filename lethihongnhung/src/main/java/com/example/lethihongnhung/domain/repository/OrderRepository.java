package com.example.lethihongnhung.domain.repository;

import com.example.lethihongnhung.domain.entity.Order;
import com.example.lethihongnhung.domain.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List; // Thêm import này để dùng List

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<OrderDetail> findByOrderId(int orderId);
}

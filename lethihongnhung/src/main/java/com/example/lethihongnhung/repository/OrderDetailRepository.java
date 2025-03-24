package com.example.lethihongnhung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lethihongnhung.entity.Order;
import com.example.lethihongnhung.entity.OrderDetail;
import com.example.lethihongnhung.entity.Product;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
    // Tìm tất cả các chi tiết của một đơn hàng theo orderId
    List<OrderDetail> findByOrder_OrderId(Order orderId);
    List<OrderDetail> findByProduct(Product product);
}
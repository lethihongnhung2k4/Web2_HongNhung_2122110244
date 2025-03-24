package com.example.lethihongnhung.domain.repository;

import com.example.lethihongnhung.domain.entity.OrderDetail;
import com.example.lethihongnhung.domain.entity.Product;
import com.example.lethihongnhung.domain.entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
    // Tìm tất cả các chi tiết của một đơn hàng theo orderId
    List<OrderDetail> findByOrder_OrderId(Order orderId);
    List<OrderDetail> findByProduct(Product product);
}
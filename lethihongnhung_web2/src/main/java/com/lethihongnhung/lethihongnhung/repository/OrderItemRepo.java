package com.lethihongnhung.lethihongnhung.repository;

import org. springframework.data.jpa.repository. JpaRepository;
import org. springframework. stereotype. Repository;

import com.lethihongnhung.lethihongnhung.entity.OrderItem;

@Repository
public interface OrderItemRepo extends JpaRepository<OrderItem, Long> {
}
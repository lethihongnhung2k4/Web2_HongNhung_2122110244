package com.lethihongnhung.lethihongnhung.repository;
import org. springframework.data. jpa.repository. JpaRepository;
import org. springframework.stereotype. Repository;

import com.lethihongnhung.lethihongnhung.entity.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long>{

}
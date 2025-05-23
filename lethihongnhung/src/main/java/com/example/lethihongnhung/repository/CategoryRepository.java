package com.example.lethihongnhung.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lethihongnhung.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
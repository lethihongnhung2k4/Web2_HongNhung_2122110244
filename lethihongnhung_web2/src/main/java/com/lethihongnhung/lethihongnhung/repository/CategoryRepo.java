package com.lethihongnhung.lethihongnhung.repository;

import org. springframework.data.jpa.repository. JpaRepository;
import org. springframework.stereotype. Repository;

import com.lethihongnhung.lethihongnhung.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {
Category findByCategoryName(String categoryName);
}

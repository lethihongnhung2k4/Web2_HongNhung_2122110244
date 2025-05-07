package com.lethihongnhung.lethihongnhung.service;

import com.lethihongnhung.lethihongnhung.entity.Category;
import com.lethihongnhung.lethihongnhung.payloads.CategoryDTO;
import com.lethihongnhung.lethihongnhung.payloads.CategoryResponse;

public interface CategoryService {

    CategoryDTO createCategory(Category category);

    CategoryResponse getCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    CategoryDTO updateCategory(Category category, Long categoryId);

    String deleteCategory(Long categoryId);

    CategoryDTO getCategoryById(Long categoryId);
}

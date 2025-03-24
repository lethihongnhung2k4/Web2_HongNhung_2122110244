package com.example.lethihongnhung.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lethihongnhung.entity.Banner;

public interface BannerRepository extends JpaRepository<Banner, Integer> {
}
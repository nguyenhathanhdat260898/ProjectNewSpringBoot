package com.nguyenhathanhdat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nguyenhathanhdat.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	CategoryEntity findOneByCode(String code);
}

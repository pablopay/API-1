package com.services.ms.product.product_service.repository;

import com.services.ms.product.product_service.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

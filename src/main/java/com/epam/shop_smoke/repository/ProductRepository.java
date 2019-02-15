package com.epam.shop_smoke.repository;

import com.epam.shop_smoke.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product getProductById(Long id);
}

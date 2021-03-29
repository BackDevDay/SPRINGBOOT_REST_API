package dev.devtoday.springbootrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.devtoday.springbootrestapi.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

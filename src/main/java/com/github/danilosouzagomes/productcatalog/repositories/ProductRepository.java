package com.github.danilosouzagomes.productcatalog.repositories;

import com.github.danilosouzagomes.productcatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

package com.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.exceltodb.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>
{
}

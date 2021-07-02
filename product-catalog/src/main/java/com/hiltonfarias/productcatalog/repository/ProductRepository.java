package com.hiltonfarias.productcatalog.repository;

import com.hiltonfarias.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}

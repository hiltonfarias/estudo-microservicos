package com.hiltonfarias.shoppincart.repository;

import com.hiltonfarias.shoppincart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}

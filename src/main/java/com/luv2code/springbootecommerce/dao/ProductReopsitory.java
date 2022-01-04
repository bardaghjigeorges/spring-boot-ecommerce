package com.luv2code.springbootecommerce.dao;

import com.luv2code.springbootecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface ProductReopsitory extends JpaRepository<Product, Long> {
}

package com.pedroprior.springbasicproject.repositories;

import com.pedroprior.springbasicproject.entities.Product;
import com.pedroprior.springbasicproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

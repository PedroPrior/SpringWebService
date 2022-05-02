package com.pedroprior.springbasicproject.services;

import com.pedroprior.springbasicproject.entities.Order;
import com.pedroprior.springbasicproject.entities.User;
import com.pedroprior.springbasicproject.repositories.OrderRepository;
import com.pedroprior.springbasicproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();

    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }



}

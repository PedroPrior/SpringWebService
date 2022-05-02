package com.pedroprior.springbasicproject.services;

import com.pedroprior.springbasicproject.entities.Category;
import com.pedroprior.springbasicproject.entities.User;
import com.pedroprior.springbasicproject.repositories.CategoryRepository;
import com.pedroprior.springbasicproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();

    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }



}

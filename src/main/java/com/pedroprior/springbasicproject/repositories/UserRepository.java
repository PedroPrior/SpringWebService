package com.pedroprior.springbasicproject.repositories;

import com.pedroprior.springbasicproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

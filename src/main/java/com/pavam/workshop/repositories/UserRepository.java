package com.pavam.workshop.repositories;

import com.pavam.workshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { }

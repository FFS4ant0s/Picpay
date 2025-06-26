package com.picpay.Picpay.domain.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpay.Picpay.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByDocument(String document);
    
    Optional<User> findUserByDocument(Long id);
}

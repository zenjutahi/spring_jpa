package com.learing.jpa.concepts.javalearningjpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learing.jpa.concepts.javalearningjpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

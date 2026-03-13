package com.EventHub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EventHub.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
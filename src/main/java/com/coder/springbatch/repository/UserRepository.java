package com.coder.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coder.springbatch.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	

}

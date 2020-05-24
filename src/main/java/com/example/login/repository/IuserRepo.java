package com.example.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;
@Repository
public interface IuserRepo extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);
	
	User findByPassword(String password);

}

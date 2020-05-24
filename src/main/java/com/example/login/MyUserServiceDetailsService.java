package com.example.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


import com.example.login.repository.IuserRepo;

public class MyUserServiceDetailsService implements UserDetailsService {
	@Autowired
	IuserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
       User user=userRepo.findByUsername(username);
		
		if(user==null) {
			throw new UsernameNotFoundException("User 404");		
		}
		
		// TODO Auto-generated method stub
		return  new MyUserDetails(user);
	}
	}



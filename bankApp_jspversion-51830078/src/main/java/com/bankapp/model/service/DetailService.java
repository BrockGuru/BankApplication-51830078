package com.bankapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bankapp.model.entities.User;
import com.bankapp.model.exceptions.UserNotFoundException;
//@Service
public class DetailService implements UserDetailsService {
	@Autowired
	private UserService service;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = service.findByEmail(email);

		System.out.println("-------------------------");
		System.out.println(user);
		if(user==null)
		{
			throw new UserNotFoundException();
		}
		else
		{
			return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(), AuthorityUtils
					.createAuthorityList(user.getRoles()));
		}
		
	}

}

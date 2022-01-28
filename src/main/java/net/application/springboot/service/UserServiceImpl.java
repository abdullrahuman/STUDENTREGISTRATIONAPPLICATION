package net.application.springboot.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.application.springboot.model.Role;
import net.application.springboot.model.User;
import net.application.springboot.repository.UserRepository;
import net.application.springboot.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{
	
  
	@Autowired
	private UserRepository UserRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.UserRepository=userRepository;
	}
	
	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getFisrtname(), registrationDto.getLastname(), registrationDto.getEmail(), registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
	
		return UserRepository.save(user);
    }
}
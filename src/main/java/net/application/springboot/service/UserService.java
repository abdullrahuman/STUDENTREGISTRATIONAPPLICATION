package net.application.springboot.service;

import net.application.springboot.model.User;
import net.application.springboot.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);
 
}

package net.application.springboot.web1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.application.springboot.service.UserService;
import net.application.springboot.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService UserService;

	public UserRegistrationController(net.application.springboot.service.UserService userService) {
		super();
		this.UserService = userService;
	}
	
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	@GetMapping
	public String showRegistrationForm(Model model) {
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user")UserRegistrationDto registrationDto) {
	    UserService.save(registrationDto);
	    return "redirect:/registration?success";
	}
}

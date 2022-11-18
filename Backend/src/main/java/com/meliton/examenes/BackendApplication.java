package com.meliton.examenes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.meliton.examenes.services.UserService;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {
	
	@Autowired
	UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	/*	User user = new User();
		user.setId(1L);
		user.setUserName("orlando2409");
		user.setPassword("contra123");
		user.setNames("Jesus Orlando");
		user.setSurnames("Gil Jauregui");
		user.setEmail("ogiljauregui@gmail.com");
		user.setEnabled(true);
		
		Role role = new Role();
		role.setId(1L);
		role.setName("Administrador");
		
		Set<UserRole> userRoles = new HashSet<>(); 
		
		UserRole userRole = new UserRole();
		userRole.setId(1L);
		userRole.setUser(user);
		userRole.setRole(role);
		userRoles.add(userRole);
		
		User userLocal = userService.register(user, userRoles);*/
	}

}

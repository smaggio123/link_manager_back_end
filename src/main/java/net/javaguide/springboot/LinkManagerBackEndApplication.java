package net.javaguide.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LinkManagerBackEndApplication {

	public static void main(String[] args) {
		//http://localhost:8090/h2-console
		//http://localhost:8090/welcome
		//http://localhost:8090/post
		//http://localhost:8090/users
		//http://localhost:8090/student
		//http://localhost:8090/location
		//http://localhost:8090/home
		SpringApplication.run(LinkManagerBackEndApplication.class, args);
	}

}

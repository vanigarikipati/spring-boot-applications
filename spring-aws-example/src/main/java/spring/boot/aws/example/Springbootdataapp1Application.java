package spring.boot.aws.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Springbootdataapp1Application {
	
	@GetMapping("/")
	public String home() {
		return "Welcome AWS deployment";
	}

	public static void main(String[] args) {
		SpringApplication.run(Springbootdataapp1Application.class, args);
	}

}

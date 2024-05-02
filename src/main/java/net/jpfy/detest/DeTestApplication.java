package net.jpfy.detest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DeTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeTestApplication.class, args);
	}

	@GetMapping(value = "/")
	public String doGetHelloWorld() {
		return "Hello World";
	}

	@GetMapping(value = "/test")
	public String test() {
		return "test";
	}

	@GetMapping(value = "/jpfy")
	public String jpfy() {
		return "안녕하세요!";
	}
}

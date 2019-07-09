package sample.spring.project.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private static final String GREETING_FORMAT = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	// enter - http://localhost:7100
	@RequestMapping("")
	public String defaultMessage() {
		return "Welcome!";
	}
	
	// enter - http://localhost:7100/hello
	@RequestMapping("/hello")
	public String sayHello() {
		return "Say Hello";
	}
	
	// enter - http://localhost:7100/visit
	// enter - http://localhost:7100/visit?name=David
	@RequestMapping("/visit") 
	@ResponseBody
	public HelloGreeting sayGreeting(
			@RequestParam(
				name = "name", 
				required = false, 
				defaultValue = "visitor")
				String name
			) {
			return new HelloGreeting(counter.incrementAndGet(), String.format(GREETING_FORMAT, name));
			
	}
	
}

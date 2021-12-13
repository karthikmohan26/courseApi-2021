package io.karthik.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Step 5

@RestController
public class HelloController {

	@RequestMapping(method=RequestMethod.GET, value="/hello")
	public String Hello() {

		return "Welcome to Spring Boot";
	}
	}

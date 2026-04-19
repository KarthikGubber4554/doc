package com.dp45.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBengaluru {
	
	@GetMapping("/message")
	public String getMessage() {
		return "MY-FIRST-DOCKER-JENKINS-KUBERNETES-PROJECT-DEPLOYMENT-SUCCESSFULL";
	}

}

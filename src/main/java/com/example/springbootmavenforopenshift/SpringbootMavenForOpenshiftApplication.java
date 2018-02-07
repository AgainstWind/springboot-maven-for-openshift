package com.example.springbootmavenforopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SpringbootMavenForOpenshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMavenForOpenshiftApplication.class, args);
	}

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public @ResponseBody String index(){
		return "hello openshift!";
	}

}

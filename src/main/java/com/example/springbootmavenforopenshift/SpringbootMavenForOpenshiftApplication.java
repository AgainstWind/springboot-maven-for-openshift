package com.example.springbootmavenforopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@Controller
public class SpringbootMavenForOpenshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMavenForOpenshiftApplication.class, args);
	}

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public @ResponseBody String index(){
		InetAddress ia;
		try {
			ia = InetAddress.getLocalHost();
			return "hello openshift! response from: "+ia.getHostName()+"\n"+ia.getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
			return "hello openshift! response from:"+e.getMessage();
		}
	}

}

package com.project.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	// "say-hello" => "Hello ! What are you learning today?"

	// /say-hello
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello ! What are you learning today?";

	}

	// "say-hello-jsp" => sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		
		//creating a view for this request
		//request will redirected to sayHello.jsp file
		//Prefix and Suffix will be added with this return /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
		return "sayHello";

	}
}

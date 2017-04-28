package com.mvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//<bean id="helloController" class="com.niit.controllers.HelloController"></bean>
public class HelloController {
   @RequestMapping("/hello")
	public String helloPage(){
		return "helloPage";
	}
	@RequestMapping("/welcome")
	public String welcome(){
		return "welcomePage";
	}
	@RequestMapping("/getUserForm")
	public String getUserForm() {
		return "sayHelloToUser";
		
	}
	
	@RequestMapping("/helloUser")
	public String sayHelloToUser(HttpServletRequest request,Model model){
		String name=request.getParameter("name");
		model.addAttribute("message","welcom"+name);
		return "welcomePage";
	}
}
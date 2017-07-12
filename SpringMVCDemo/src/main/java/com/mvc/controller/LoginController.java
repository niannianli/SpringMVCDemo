package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.vo.LoginFormBean;

// this is model class, but is controller
// all request go through this controller
// inside java code is model part to be executed

//object created by spring
@Controller
public class LoginController {
	
	//if login.html url is requeted, this method is called
	//Model is spring object created to use directly
	@RequestMapping(value="/login.html", method=RequestMethod.GET)
	public String doLogin(Model model){
	//	System.out.println("hello");		
		// map jsp spring form to class object
		model.addAttribute("loginFormBean", new LoginFormBean());
		// now we can get this attribute/value in jsp
		return "index.jsp";
	}
	
	//if doLogin.html url is requeted, this method is called
	@RequestMapping(value="/doLogin.html", method=RequestMethod.POST)
	public String validateUser(Model model, @RequestParam(value="username") String username, @RequestParam(value="password") String password){		
		System.out.println(username+":"+password);	
		return "dashboard.jsp";
	}

}
// login page
// boostroop
// css
//javascript
// add to required.jsp

// login page
// send request to
// intriger hibernate
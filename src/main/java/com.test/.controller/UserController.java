package com.test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.test.model.User;
import jakarta.servlet.http.HttpServletRequest;
@Controller
public class UserController {
	
	@RequestMapping("/submituser")
public String submitForm(HttpServletRequest request, Model model) {
	
	String usr= request.getParameter("user");
	String pas= request.getParameter("pwd");
	
	User user= new User();
	
	user.setUserName(usr);
	user.setPassword(pas);
	model.addAttribute("info", user);
	
	
	return "userdata";
}
}

package com.crime.branch.crimesystem.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crime.branch.crimesystem.dao.UserRepository;
import com.crime.branch.crimesystem.model.UserInfo;
import org.springframework.ui.Model;
@RequestMapping("/user")
@Controller()

public class UserController {
	
	@Autowired
	private  BCryptPasswordEncoder password;
	
	@Autowired
	private UserRepository userrepo;

	
	@ModelAttribute
	public void addCommonData(Model model, Principal principle)
	{
		String username=principle.getName();
		UserInfo user=userrepo.getUserbyUserid(username);
		model.addAttribute("user",user);
		
	}
	@RequestMapping("/index")
	
	public String dashboard(Model model, Principal principle)
	{
		model.addAttribute("title", "userdashboard");
		return "user/dashboard";
	}
	
	
}

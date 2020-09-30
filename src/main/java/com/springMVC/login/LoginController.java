package com.springMVC.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class LoginController {
	LoginService validate  = new LoginService();
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String Hello()
	{
		return "login";
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String Welcome(ModelMap map ,@RequestParam String name,@RequestParam String password)
	{
		
		boolean user = validate.ValidateUser(name, password);
		if(!user)
		{
			map.addAttribute("errormessage", "username or password is incorrect");
			return "login";
		}
		map.addAttribute("name", name);
		return "welcome";
	}
	

}

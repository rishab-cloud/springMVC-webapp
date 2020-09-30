package com.springMVC.login;

public class LoginService {
	
	public boolean ValidateUser(String name,String Password)
	{
		if(name.equalsIgnoreCase("Rishab") && Password.equals("Rish@1234"))
		{
			return true;
		}
		return false;
	}

}

package Asserts_demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class logintest {
  @Test
  public void login(@Optional("admin") String user,@Optional("123456") String pass) {
	  System.out.println("enter username and password:");
	  System.out.println("username: "+user);
	  System.out.println("password: "+pass);
	  
	  if(user.equals("admin") && pass.equals("123456")) {
		  System.out.println("login successfull");
	  }
	  else {
		  System.out.println("invalid login");
	  }
  }
}

//Find if the email is on gmail. Find the domain and username

import java.lang.*;
import java.util.*;

class VerifyEmail{
	public static void main(String args[]){
		String email ="programmer@gmail.com";
		if(email.matches(".*@gmail.com")){
			System.out.println("It is valid email");
		}else{
			System.out.println("It is an invalid email");
		}
		
		int i = email.indexOf("@");
		String username = email.substring(0, i);
		String domain = email.substring(i+1, email.length());
		
		System.out.printf("Username = %s    Domain = %s\n", username, domain);
	}
}
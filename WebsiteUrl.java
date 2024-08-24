import java.util.*;
import java.lang.*;

class WebsiteUrl{
	public static void main(String args[]){
		String url;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter URL:");
		url=sc.next();
		
		String protocol = url.substring(0, url.indexOf(":"));
		
		if(protocol.equals("http"))
			System.out.println("Hyper Text Transfer Protocol");
		else if(protocol.equals("ftp"))
			System.out.println("File Transfer Protocol");
		else if(protocol.equals("https"))
			System.out.println("Hyper Text Transfer Protocol Secure");
		else 
			System.out.println("Invalid Protocol, Please check URL");
		
		String ext = url.substring(url.lastIndexOf(".")+1);
		if(ext.equals("com"))
			System.out.println("Commercial");
		else if(ext.equals("org"))
			System.out.println("Organisation");
		else if(ext.equals("net"))
			System.out.println("Network");
		else
			System.out.println("Invalid Extension, Please check URL");
		
	}
}
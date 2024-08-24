import java.lang.*;
import java.util.*;

class StringManipulation{
	public static void main(String args[]){
		String str = "Java programming is fun and Java is powerful.";
		System.out.println(str.toLowerCase());
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.trim());
		System.out.println(str.substring(1));
		System.out.println(str.substring(1,4));
		System.out.println(str.replace('a', 'z'));
		
		if(str.startsWith("a")){
			System.out.println("The string start with a");
		}else if (str.startsWith("ja")){
			System.out.println("The string start with j");
		}else{
			System.out.println("The string does not either start with a or j");
		}
		
		if(str.endsWith("a")){
			System.out.println("The string ends with a");
		}else if (str.endsWith("j")){
			System.out.println("The string ends with j");
		}else{
			System.out.println("The string does not either end with a or j");
		}
		
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf("av"));
		System.out.println(str.lastIndexOf("av"));
		
		String str1 ="java";
		String str2 ="java";
		String str3 = new String("java");
		
		if (str1.equals(str2)){
			System.out.println("String str1 and str2 are equals");
		}
		
		if (str1.equals(str3)){
			System.out.println("String str1 and str3 are equals");
		}
		
		if(str1==str2){
			System.out.println("Ref str1 and str2 are referencing to same String literal");
		}
		
		if(str1==str3){
			System.out.println("Ref str1 and str3 are referencing to same String literal");
		}else{
			System.out.println("Ref str1 and str3 are not referencing to same String literal");
		}
		
		System.out.println(str.equalsIgnoreCase(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.compareTo(str2));
		
		System.out.println(String.valueOf(65));
	}
}
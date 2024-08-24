import java.lang.*;
import java.util.*;

class RegexEx{
	public static void main(String args[]){
		String str ="a@se#wdg$%^FshT&";
		str=str.replaceAll("\\W",""); //To remove special characters from a string
		System.out.println(str);  //asewdgFshT
		
		String str1 = "     This     is my     string     without   spaces.  ";
		str1=str1.trim(); //to remove leading spaces
	    str1=str1.replaceAll("\\s+"," ");  // This is my string without spaces.
		System.out.println(str1);
		
		
		String words[] = str1.split("\\s");
		
		for(int i = 0 ; i<words.length; i++)
			System.out.println(words[i]);
		System.out.println("No of words in the string = "+ words.length);
		
	}
	
}
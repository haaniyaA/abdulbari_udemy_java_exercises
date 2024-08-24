import java.util.*;
import java.lang.*;

class SCString{
	public static void main(String args[]){
		int num = 110111000;
		String b = String.valueOf(num);
		if(b.matches("[01]+"))
			System.out.println("Given number is binary");
		else
			System.out.println("Given number is not binary");
		 
		String hexNum = "A12F3045BC127";
		if(hexNum.matches("[0-9A-F]+"))
			System.out.println("Given number is hexadecimal");
		else
			System.out.println("Given number is not hexadecimal");
		
		String date = "12/12/2021";
		String pattern = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d{2}$";
		if(date.matches(pattern))
			System.out.println("Given String  is a date");
		else
			System.out.println("Given String  is not a date");
		 
		
	}
}
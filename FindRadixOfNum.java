import java.lang.*;
import java.util.*;

class FindRadixOfNum{
	public static void main(String args[]){
		String num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		num=sc.next();
		
		if(num.matches("[01]+"))
			System.out.println("Radix of given number is 2");
		else if(num.matches("[0-7]+"))
			System.out.println("Radix of given number is 8");
		else if(num.matches("[0-9]+"))
			System.out.println("Radix of given number is 10");
		else if(num.matches("[0-9A-Fa-f]+"))
			System.out.println("Radix of given number is 16");
		else
			System.out.println("Invalid number");
	}
}
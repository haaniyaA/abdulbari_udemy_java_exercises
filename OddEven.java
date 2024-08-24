import java.lang.*;
import java.util.*;

class OddEven{
	public static void main(String args[]){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		num = sc.nextInt();
		if(num%2 !=0)
			System.out.println("Given Number is odd");
		else
			System.out.println("Given Number is even");
		
		int age;
		System.out.println("Enter age:");
		age = sc.nextInt();
		
		if(age>=14 && age<=55 )
			System.out.println("Given age is considered young");
		else
			System.out.println("Given age is not considered young");
	}
	
}
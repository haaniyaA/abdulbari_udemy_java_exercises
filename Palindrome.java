import java.lang.*;
import java.util.*;


class Palindrome{
	public static void main(String args[]){
		int num,i,revNum=0,r;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter number:");
		num=sc.nextInt();
		i=num;
		
		while(i!=0){
			r=i%10;
			revNum = revNum*10 + r;
			i=i/10;
		}
		
		System.out.printf("The reversed number is: %d\n", revNum);
		
		if(num==revNum)
			System.out.printf("It is a palindrome number.");
		else
			System.out.printf("It is not a palindrome number.");
	}
}
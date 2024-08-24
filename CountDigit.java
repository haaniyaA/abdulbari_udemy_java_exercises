import java.util.*;
import java.lang.*;

class CountDigit{
	public static void main(String args[]){
		int num;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter number:");
		num=sc.nextInt();
		
		String strNum=Integer.toString(num);
		System.out.printf("The number of digits are: %d", strNum.length());
		
		//Approach2
		System.out.println("\nApproach2\nThe digits are:");
		int digitCount=0;
		
		while(num!=0){
			num=num/10;
			digitCount++;
		}
		
		System.out.printf("The number of digits are: %d", digitCount);
	}
	
}
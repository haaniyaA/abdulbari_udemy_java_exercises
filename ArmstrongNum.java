import java.util.*;
import java.lang.*;

class ArmstrongNum{
	public static void main(String args[]){
		int num,i,sum=0,r;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter number:");
		num=sc.nextInt();
		i=num;
		String strNum=Integer.toString(num);
		int digitCount=strNum.length();
		
		while(i!=0){
			r=i%10;
			sum += Math.pow(r,digitCount);
			i=i/10;
		}
		
		System.out.printf("The number of digits are: %d\n", digitCount);
		System.out.printf("The sum of digits raised to power of digCount is: %d\nṇ", sum);
		
		if(sum==num)
			System.out.println("It is an Armstrong Number");
		else
			System.out.println("It is not an Armstrong Number");
	}
	
}
import java.lang.*;
import java.util.*;


class ReverseNum{
	public static void main(String args[]){
		int num,i,revNum=0,r;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter number:");
		num=sc.nextInt();
		
		while(num!=0){
			r=num%10;
			revNum = revNum*10 + r;
			num=num/10;
		}
		
		System.out.printf("The reversed number is: %d\n", revNum);
	}
}
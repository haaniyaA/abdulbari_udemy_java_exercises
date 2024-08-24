import java.lang.*;
import java.util.*;

class DisplayDigit{
	public static void main(String args[]){
	
		int num;		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		num=sc.nextInt();
		
		String strNum=Integer.toString(num);
		System.out.println("The digits are:");
		for(int i=0;i<strNum.length();i++){
			System.out.printf("%c ", strNum.charAt(i));
		}
		
		
		//Approach2
		System.out.println("\nApproach2\nThe digits are:");
		int arr[] = new int[100];
		int r, i=0;
		
		while(num!=0){
			r=num%10;
			arr[i++]=r;
			num=num/10;
		}
		
		for(int j=i-1;j>=0;j--)
			System.out.printf("%d ", arr[j]);
		
	}
	
}
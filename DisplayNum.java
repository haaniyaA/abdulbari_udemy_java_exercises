import java.lang.*;
import java.util.*;

class DisplayNum{
	public static void main(String args[]){
		int num;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter number:");
		num=sc.nextInt();
		
		String strNum=Integer.toString(num);
		
		for(int i=0; i<strNum.length();i++){
			char ch = strNum.charAt(i);
			
			switch(ch){
				case '0':
					System.out.printf("Zero ");
					break;
				case '1':
					System.out.printf("One ");
					break;
				case '2':
					System.out.printf("Two ");
					break;
				case '3':
					System.out.printf("Three ");
					break;	
				case '4':
					System.out.printf("Four ");
					break;
				case '5':
					System.out.printf("Five ");
					break;
				case '6':
					System.out.printf("Six ");
					break;
				case '7':
					System.out.printf("Seven ");
					break;
				case '8':
					System.out.printf("Eight ");
					break;
				case '9':
					System.out.printf("Nine ");
					break;
			}
		}
	}
}
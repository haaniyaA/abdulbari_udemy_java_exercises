import java.lang.*;
import java.util.*;


class Fibonacci{
	public static void main(String args[]){
		int term;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter no. of terms you want in the Fibonacci series:");
		term=sc.nextInt();
		if(term<1){
			System.out.println("Invalid term");
			System.exit(0);
		}
		
		int prev1=0, prev2=1;
		
		System.out.println("The Fibonacci series:");
		
		for(int i=1;i<=term;i++){
			if(i>2){
				int curr = prev1 + prev2;
				prev1=prev2;
				prev2=curr;
				System.out.printf("%d ", curr);
			}
			else if(i==1)
				System.out.printf("%d ", prev1);
			else if(i==2)
				System.out.printf("%d ", prev2);
		}
	}
}
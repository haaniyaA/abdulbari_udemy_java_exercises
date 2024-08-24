import java.lang.*;
import java.util.*;

class SwapTwoNums{
	
	public static void main(String args[]){
		
	int a,b;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter two numbers: ");
	
	a = sc.nextInt();
	b = sc.nextInt();
	
	a=a^b;
	b=a^b;
	a=a^b;
	
	System.out.println("The swapped numbers are: "+a + " , " +b );

	}
	
}
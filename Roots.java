import java.lang.*;
import java.util.*;

class Roots{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//ax^2 + bx +c=0
		
		int a, b,c ;
		double r1,r2;
		
		System.out.println("Enter a,b,c");
		
		a = sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		r1 = (-b + Math.sqrt(b*b-4*a*c))/2;
		r2 = (-b - Math.sqrt(b*b-4*a*c))/2;
		
		System.out.println("The roots are "+ r1 + " , " +r2);
		
	}
}
import java.lang.*;
import java.util.*;

class FindGrades{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int m1,m2,m3,m4;
		float avg;
		
		System.out.println("Enter marks obtained in best of four subjects:");
		
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		
		avg = (m1+m2+m3+m4)/4f;
		
		if(avg>=70)
			System.out.println("You have scored grade 'A'");
		else if (avg>=60 && avg <70)
			System.out.println("You have scored grade 'B'");
		else if (avg>=50 && avg <60)
			System.out.println("You have scored grade 'C'");
		else if (avg>=40 && avg <50)
			System.out.println("You have scored grade 'D'");
		else 
			System.out.println("FAIL");
	}
}
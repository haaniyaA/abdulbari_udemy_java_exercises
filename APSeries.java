import java.lang.*;
import java.util.*;


class APSeries{
	public static void main(String args[]){
		int term, firstTerm, commonDiff;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter no. of terms you want in the AP series:");
		term=sc.nextInt();
		if(term<1){
			System.out.println("Invalid term");
			System.exit(0);
		}
		
		System.out.println("Enter 1st term in the AP series:");
		firstTerm=sc.nextInt();
		
		System.out.println("Enter common difference in the AP series:");
		commonDiff=sc.nextInt();
		
		System.out.println("The AP series:");
		
		for(int i=0;i<term;i++){
			System.out.printf("%d ", (firstTerm+i*commonDiff));
		}
	}
}
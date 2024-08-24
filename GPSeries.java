import java.lang.*;
import java.util.*;


class GPSeries{
	public static void main(String args[]){
		int term, firstTerm, commonRatio;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter no. of terms you want in the GP series:");
		term=sc.nextInt();
		if(term<1){
			System.out.println("Invalid term");
			System.exit(0);
		}
		
		System.out.println("Enter 1st term in the GP series:");
		firstTerm=sc.nextInt();
		
		System.out.println("Enter common difference in the GP series:");
		commonRatio=sc.nextInt();
		
		System.out.println("The GP series:");
		
		for(int i=0;i<term;i++){
			System.out.printf("%d ", firstTerm * (int) Math.pow(commonRatio, i));
		}
	}
}
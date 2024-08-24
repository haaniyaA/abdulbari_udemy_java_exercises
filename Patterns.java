import java.lang.*;
import java.util.*;


class Patterns{
	public static void main(String args[]){
		int term;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter n:");
		term=sc.nextInt();
		if(term<1){
			System.out.println("Invalid term");
			System.exit(0);
		}
		
		
		System.out.println("Pattern 1:\n");
		
		for(int i=1;i<=term;i++){
			for(int j=1;j<=i;j++)
				System.out.printf("%d ",j);
			System.out.printf("\n");
		}
		
		System.out.printf("\n\n\n");
		System.out.println("Pattern 2:\n");
		
		int num=1;
		for(int i=1;i<=term;i++){
			for(int j=0;j<i;j++)
				System.out.printf("%3d ",num++);
			System.out.printf("\n");
		}
		
		System.out.printf("\n\n\n");
		System.out.println("Pattern 3:\n");
		
		for(int i=0;i<term;i++){
			for(int j=0;j<term-i;j++)
				System.out.printf("%d ",j+1);
			System.out.printf("\n");
		}
		
		
		System.out.printf("\n\n\n");
		System.out.println("Pattern 4:\n");
		
		for(int i=1;i<=term;i++){
			for(int j=1;j<=i;j++)
				System.out.printf("%d ",j);
			System.out.printf("\n");
		}
		for(int i=0;i<term;i++){
			for(int j=0;j<term-i;j++)
				System.out.printf("%d ",j+1);
			System.out.printf("\n");
		}
		
		System.out.printf("\n\n\n");
		System.out.println("Pattern 5:\n");
		
		for(int i=0;i<term;i++){
			for(int j=0;j<term;j++){
				if(j<i)
					System.out.printf(" ");
				else
					System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
		System.out.printf("\n\n\n");
		System.out.println("Pattern 6:\n");
		
		for(int i=1;i<=term;i++){
			for(int j=0;j<term;j++){
				if(j<term-i)
					System.out.printf(" ");
				else
					System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
		System.out.printf("\n\n\n");
		System.out.println("Pattern 7:\n");
		
		for(int i=0;i<term;i++){
			for(int j=0;j<=2*term;j++){
				if(j<term-i || j>term+i)
					System.out.printf(" ");
				else
					System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
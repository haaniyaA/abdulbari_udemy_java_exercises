import java.lang.*;
import java.util.*;

class AreaOfTriangle{
	public static void main (String args[]){
		int base, height;
		float area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base and height of the triangle: ");
		base = sc.nextInt();
		height = sc.nextInt();
		area = (base*height)/2;
		System.out.printf("Area of the triangle with base %d and height %d: %f",base, height,area);
		
		System.out.println("Enter the three sides of the triangle: ");
		float a, b,c;
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		
		float s;
		s=(a+b+c)/2;
		double areaS;
		areaS= Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle with sodes " + a+ "," +b+ ","+c+" is " + areaS);
		
	}
}
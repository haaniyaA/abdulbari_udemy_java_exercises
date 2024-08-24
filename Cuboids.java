import java.util.*;
import java.lang.*;

class Cuboids{
	public static void main(String args[]){
		int base, length, breadth, volume, total_area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter base, length and height of the Cuboid; ");
		base = sc.nextInt();
		length = sc.nextInt();
		breadth = sc.nextInt();
		
		//Volume of cuboid = (length * breadth * base)
		//total area of cuboid = 2(len*breadth)+ 2(breadth*base)+ 2(len *base)
		
		volume = (length * breadth * base);
		total_area = 2 *((length*breadth)+ (breadth*base)+ (length *base));
		
		System.out.println("Volume of Cuboid is  " + volume);
		System.out.println("Total Area of Cuboid is  " + total_area);
	}
}
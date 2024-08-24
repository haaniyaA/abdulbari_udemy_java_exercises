import java.lang.*;
import java.util.*;

class Precisions{
	public static void main(String args[]){
		
		int x=10;
		float y=0.0012f;
		char z='C';
		
		System.out.printf("%d %f %c\n",x,y,z); // 10 0.001200 C
		System.out.printf("%e\n",y); // 1.200000e-03 
		
		System.out.printf("%1$d %2$f %3$c\n",x,y,z); // 10 0.001200 C
		
		System.out.printf("%1$d %1$d %3$c\n",x,y,z); // 10 10 C
		
		int a=10;
		System.out.printf("%5d  %1$05d\n",a); //    10  00010
		int b=-10;
		System.out.printf("%(d  %(d\n",a,b); // 10  (10)
		
		System.out.printf("%+d  %+d\n",a,b); // +10  -10
		
		float p = 123.45f;
		
		System.out.printf("%f\n",p); // 123.449997
		
		System.out.printf("%6f\n",p); // 123.449997 
		
		System.out.printf("%6.2f\n",p); // 123.45
		
		String str = "Java";
		System.out.printf("%s \n", str); // Java
		System.out.printf("%20s\n", str); //                 Java
		System.out.printf("%-20s\n", str);// Java
		
		System.out.format("%d %f %c\n",x,y,z); // 10 0.001200 C

	}
}
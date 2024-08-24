import java.lang.*;

class DataRange {
    public static void main(String args[]) {
        System.out.println("Float Min " + Float.MIN_VALUE);
        System.out.println("Float Max " + Float.MAX_VALUE);

        System.out.println("Bytes Min " + Byte.MIN_VALUE);
        System.out.println("Bytes Max " + Byte.MAX_VALUE);
        System.out.println("Bytes Max " + Byte.MAX_VALUE);
        System.out.println("Bytes " + Byte.BYTES);

        int x_$ = 2;
        System.out.println("Number is " + x_$);
	System.out.println("Different types of Base number in declaring variables");
	byte b1=10;
	byte b2=0b1010;
	byte b3=012;
	byte b4=0xA;
	System.out.println("Value of 10 in base 10 " + b1);
	System.out.println("Value of 0b1010 in base 2 " + b2);
	System.out.println("Value of 012 in base 8 " + b3);
	System.out.println("Value of 0xA in base 16 " + b4);

	
    }
}
import java.lang.*;
import java.util.*;

class SecondLargest{
	public static void main(String args[]){
		
		int arr_size=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		if(sc.hasNextInt()){
			arr_size= sc.nextInt();
			if (arr_size <= 0) {
                System.out.println("Array size must be greater than zero.");
                System.exit(0);
            }
		}
		
		int[] arr = new int[arr_size]; 
		
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<arr_size;i++){
			if(sc.hasNextInt()){
				arr[i] = sc.nextInt();
			}else{
				System.out.println("Invalid input. Please enter integers only.");
                System.exit(0);
			}
		}
		
		int largest= Integer.MIN_VALUE, second= Integer.MIN_VALUE;
		
		for(int i=0;i<arr_size;i++)
			largest = Math.max(largest,arr[i]);
		
		for(int i=0;i<arr_size;i++){
			if(arr[i] != largest)
				second = Math.max(second,arr[i]);
			
		
		}
		
		if(second == Integer.MIN_VALUE)
			System.out.println("There isn't any second largest element.");
		else
			System.out.println("The second largest element is "+ second);
		
	}
}
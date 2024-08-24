import java.lang.*;
import java.util.*;

class Arrays{
	public static void main(String args[]){
		int arr_size=0, count=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		
		if(sc.hasNextInt()){
			arr_size= sc.nextInt();
			if (arr_size <= 0) {
                System.out.println("Array size must be greater than zero.");
                System.exit(0);
            }
		}
		
		int[] arr = new int[arr_size]; 
		System.out.println("Enter the elements of the array:");
		
		for(int i=0;i<arr_size;i++){
			if(sc.hasNextInt()){
				arr[i] = sc.nextInt();
			}else{
				System.out.println("Invalid input. Please enter integers only.");
                System.exit(0);
			}
		}
		
		for (int x : arr) {
            count += x;
        }

        System.out.println("Sum of the elements of the array: " + count);
		
		System.out.println("Enter the element you want to search: ");
        int elemToSearch = 0;
		
		if(sc.hasNextInt()){
				elemToSearch = sc.nextInt();
		}
		else{
				System.out.println("No values entered");
				System.exit(0);
		}
		
		boolean found= false;
		int index =0;
		for(int x: arr){
			if(x==elemToSearch){
				System.out.println("The element is present at index " + index);
				found=true;
				break;
			}
			index++;
		}
		
		if(!found)
			System.out.println("The element is not present in the array.");
		
		int maxValue = Integer.MIN_VALUE;
		
		for(int x: arr){
			if(x>maxValue)
				maxValue=x;
		}
		
		System.out.println("Max Element in the array "+ maxValue);
		
	}
}
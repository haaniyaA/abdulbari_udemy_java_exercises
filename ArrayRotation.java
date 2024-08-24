import java.util.*;
import java.lang.*;

class ArrayRotation{
	public static void main(String args[]){
		int arr_size=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		if(sc.hasNextInt()){
			arr_size= sc.nextInt();
			if(arr_size<=0){
				System.out.println("Invalid array size:");
				System.exit(0);
			}
			
		}
		
		int arr[] = new int[arr_size];
		System.out.println("Enter the elements of the array:");
		for (int i=0; i<arr_size;i++){
			if(sc.hasNextInt()){
			arr[i]= sc.nextInt();
		}
		}
		
		System.out.println("The elements of the array:");
		for (int d: arr){
			System.out.printf("%d ", d);
		}
		
		System.out.println("\n\n\nThe elements of the array after L rotation:");
		
		int temp=arr[0];
		for(int i=0;i<arr_size-1;i++)
			arr[i]=arr[i+1];
		arr[arr_size-1] =temp;
		for (int d: arr)
			System.out.printf("%d ", d);
		
		System.out.println("\n\n\nThe elements of the array after R rotation:");
		
		temp=arr[arr_size-1];
		for(int i=arr_size-1;i>0;i--)
			arr[i]=arr[i-1];
		arr[0] =temp;
		for (int d: arr)
			System.out.printf("%d ", d);
		
		
		}
	}
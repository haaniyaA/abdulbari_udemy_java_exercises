import java.util.*;
import java.lang.*;

class ArrayManipulation{
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
		
		
		// Increased the size of the array
		
		int b[] = new int[2*arr.length];
		for (int i=0; i<arr_size;i++){
			b[i]=arr[i];
		}
		arr=b;
		b=null;
		
		//inserting element at given index
		
		System.out.println("\n\n\nEnter the element you want to insert:");
		int insertElem=-1;
		if(sc.hasNextInt()){
			insertElem= sc.nextInt();
			
		}
		System.out.println("Enter the index where you want to insert:");
		int index=-1;
		if(sc.hasNextInt()){
			index= sc.nextInt();
			
		}
		
		
		for(int i=arr_size;i>index;i--)
			arr[i]=arr[i-1];
		
		arr[index]=insertElem;
		arr_size++;
		
		System.out.println("Array after inserting the element");
		for (int i=0; i<arr_size;i++){
			if(arr[i]==-1)
				break;
			System.out.printf("%d ", arr[i]);
		}
			
		//Deleting an element at given index
		
		System.out.println("\n\n\nEnter the element you want to delete:");
		int deleteElem=-1;
		if(sc.hasNextInt()){
			deleteElem= sc.nextInt();
			
		}
		
		for(int i=0;i<arr_size;i++){
			if(arr[i]==deleteElem){
				for(int j=i;j<arr_size;j++)
					arr[j]=arr[j+1];
				break;
			}
		}
		
		
		System.out.println("Array after deleting the element");
		for (int i=0; i<arr_size+1;i++){
			if(arr[i]==-1 || arr[i]==0)
				break;
			System.out.printf("%d ", arr[i]);
		}
		}
	}
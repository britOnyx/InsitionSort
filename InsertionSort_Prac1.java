package Insertion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InsertionSort_Prac1 {

	private static int myNumber[];
	private static Scanner scan;
	
	public static void main(String[] args)
	{
		System.out.println("Hello World - Insertion 1");
		
		int tempNumb[] = {1,4,8,6,5,2,9};
		
		myNumber = tempNumb;
			
		Insert(tempNumb, 3);
		insertionSort(myNumber,1);
		
		//print the sorted array
	    System.out.println("Sorted Array:" + Arrays.toString(myNumber));
	}
	
	static void Insert(int[] myNumb, int n)
	{
		//get current number
		int y = myNumb[n];
		
		//get previous number
		int x = n-1;
		
		//while previous number is greater than 0 and is greater than the current value
		while(x >= 0 && y< myNumb[x])
		{
			//swap the current value with the previous one
			myNumb[x+1] = myNumb[x];
			
			//go to the next previous number
			x--;
		}
		myNumb[x+1] = y;
	}
	
	public static void insertionSort(int arr[], int n)
	{
		 for(int i =1; i < n; i++)
		 {
			 Insert(arr,i);
		 }

	}
}

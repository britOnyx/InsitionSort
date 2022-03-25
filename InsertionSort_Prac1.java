package Insertion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class InsertionSort_Prac1 {

	
	private static BufferedReader inp;
	
	public static void main(String[] args) throws IOException
	{
		
		inp = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Hello World - Insertion 1");
		
		int tempNumb[] = {1,4,8,6,5,2,9};
		
		
		
		
		//This will use the list already declared to sort the values in ascending order
		System.out.println(SortMyStaticList(tempNumb));
		
		
		//separate function which allows the user to enter values for a list
		SortMyDynamicList();
	}
	
	private static void SortMyDynamicList() throws IOException {
		
		System.out.println("Enter a list values (seperate with space). Press 'Enter' when done");
		
		
		//store user input into a variable
		String readvalues = inp.readLine();
		
		
		//split the values into a list
		String[] listofValues = readvalues.trim().split("[,\\s+]"); // reads the string and split them up into separate values
        
		//create a list of integers which will store the string values
		int[] listofNumbers = new int[listofValues.length];
		
		
		//go through each element of the string list
		for (int i = 0; i < listofValues.length; i++) {
			
			//convert the values into integers and store into int list
			listofNumbers[i] = Integer.parseInt(listofValues[i]);
	    }
		
		InsertionSort(listofNumbers);
		
		//print the sorted array
	    System.out.println("Sorted Array:" + Arrays.toString(listofNumbers));
	}

	static void Insert(int[] myNumb, int n)
	{
		//get number position
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
	
	public static void InsertionSort(int[] arr)
	{
		 for(int i =1; i < arr.length; i++)
		 {
			 Insert(arr,i);
		 }

	}
	
	private static String SortMyStaticList(int[] tempValueList)
	{
		InsertionSort(tempValueList);
		
		//print the sorted array
	    return "Sorted Array:" + Arrays.toString(tempValueList);
	}
}

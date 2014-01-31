/*
  January 02, 2014
Author: EngineerLuna
  */
 
import java.util.*;
public class BubbleSortAnalysis{
	public static void main(String[] args){
		
		//An array with #'s that will be used to determine the
		//size of the array that will be sorted
		int[] sizeOfArray = {50, 500, 5000,50000};

		
		for(int m=0; m < sizeOfArray.length; m++)
		{
				//Created the array with various sizes 
				//depending on the sizeOfArray location
				int[] a = new int[sizeOfArray[m]];

		
				//Fill array a with random integers
				Random rng = new Random();
				for(int k = 0; k <sizeOfArray[m] ; k++)
					a[k] = rng.nextInt(10000);
			
			
				//Timed algorithm starts here
				long startTime = System.currentTimeMillis();
				
				//Buble Sort
				for(int k = 0; k<sizeOfArray[m]; k++)
					for(int j = 0; j < sizeOfArray[m]-1; j++)
					{
				//if the previous number is greater than the next number
				//switch positions. 
						if(a[j] >= a[j+1])
						{
								int temp = a[j];
								a[j] = a[j+1];
								a[j+1] = temp;
						}
					}
				//Timed Algorithm stops here
				long stopTime = System.currentTimeMillis();
				//Calculate the Total Time it took to sort
				long elapsedTime = stopTime - startTime; //milli sec

				//Print Results	
				System.out.println("Size= " + sizeOfArray[m] + "\t\tElapsed Time for Bubble Sort = " + elapsedTime + " milliseconds");
				System.out.println("seconds: "+(float)elapsedTime/1000);
		}
	}
}



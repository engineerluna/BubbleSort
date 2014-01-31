/*Analysis of BubbleSort Algorithm Example to Practice Java Skills

  Computed the BubbleSort Algorithm using four different amount of numbers needed
  to be sorted and then displayed the times to compare. Used the RunTime to 
  compare operations.


--Results-----------------------------------------------------------------------
luis@ubpc:~/Desktop/Project$ java BubbleSortAnalysis > results.txt
luis@ubpc:~/Desktop/Project$ cat results.txt 
Size= 50		Elapsed Time for Bubble Sort = 0 milliseconds
seconds: 0.0
Size= 500		Elapsed Time for Bubble Sort = 12 milliseconds
seconds: 0.012
Size= 5000		Elapsed Time for Bubble Sort = 164 milliseconds
seconds: 0.164
Size= 50000		Elapsed Time for Bubble Sort = 14365 milliseconds
seconds: 14.365
--------------------------------------------------------------------------------
  
  January 02, 2014
Author: EngineerLuna
  */
 
import java.util.*;
public class BubbleSortAnalysis{
	public static void main(String[] args){
		
		int[] sizeOfArray = {50, 500, 5000,50000};

		
		for(int m=0; m < sizeOfArray.length; m++)
		{
		
				int[] a = new int[sizeOfArray[m]];
				Random rng = new Random();
		
				//Fill array a with random integers
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



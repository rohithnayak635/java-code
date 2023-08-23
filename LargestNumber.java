Write a program to find the largest number in a given array

Testcase:
arr: {1,4,3,6,3,7,9,10,12,4}
Ouput: 12

-1

Code:
import java.util.*;
class LargestNumber
{
	public static void main(String args[])
  {
  	int arr[] = {1,4,3,6,3,7,9,10,12,4};
    int large = -1; 
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]>large)
      {
      	large = arr[i];
      }
      
    }
    System.out.println("The largest number from the array is: "+ large);
  }
}


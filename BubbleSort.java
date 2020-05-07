package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n,swap;
		
		System.out.println("Enter the size of Sorting Elements : ");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the Elements to be Sorted : ");
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//the logic for swapping the elements for sorting
		for(int i = 0;i < n-1; i++)
		{
			for(int j = 0;j < n-i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					swap = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = swap;
				}
			}
		}
		
		System.out.println("The Entered Elements in Sorted Order : ");
		for(int i = 0;i < n;i++)
			System.out.print(arr[i]+" ");
	}
}


/*
Output : 
	
	Enter the size of Sorting Elements : 
		5
		Enter the Elements to be Sorted : 
		10
		45
		62
		43
		27
		The Entered Elements in Sorted Order : 
		10 27 43 45 62 
		
	*/	

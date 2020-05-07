package sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n,swap,pos;

		System.out.println("Enter the size of Sorting Elements : ");
		n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the Elements to be Sorted : ");
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i  = 0; i < (n-1); i++)
		{
			pos = i;
			for(int j = i+1;j < n; j ++)
			{
				if(arr[pos] > arr[j])
					pos = j;
			}
			if(pos != i)
			{
				swap = arr[i];
				arr[i] = arr[pos];
				arr[pos] = swap;
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
		15
		45
		23
		45
		62
		The Entered Elements in Sorted Order : 
		15 23 45 45 62
		*/

package sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int key,j,n;

		System.out.println("Enter the size of Sorting Elements : ");
		n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the Elements to be Sorted : ");
		for(int i = 0;i<n;i++)
			arr[i] = sc.nextInt();
		
		//logic for sorting array elements during inserting them
		for(int i = 0;i<n;i++) 
		{
			key = arr[i];
			j = i-1;
			while(j >=0 && arr[j] >key) 
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		System.out.println("The Entered Elements in Sorted Order : ");
		for(j = 0;j < n;j++)
			System.out.print(arr[j]+" ");
	}
}

/*
Output : 
	Enter the size of Sorting Elements : 
		5
		Enter the Elements to be Sorted : 
		30
		10
		50
		40
		70
		The Entered Elements in Sorted Order : 
		10 30 40 50 70 
		*/
		

package sorting;

import java.util.Scanner;

public class QuickSort {
	
	public static int[] quickSorting(int[] a,int first,int last) 
	{
		int i,j,pivot,temp;
		
		if(first < last) 
		{
			pivot = first;
			i = first;
			j = last;
			while(i<j)
			{
				while(a[i] <= a[pivot] && i < last)
					i++;
				while(a[j] > a[pivot])
					j--;
				if(i < j) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
			temp = a[pivot];
			a[pivot] = a[j];
			a[j] = temp;
			
			quickSorting(a,first,j-1);
			quickSorting(a,j+1,last);
		}
		return a;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count,n;
		
		System.out.println("Enter the size of Sorting Elements : ");
		n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the Elements to be Sorted : ");
		for(int i = 0;i<n;i++)
			arr[i] = sc.nextInt();
		
		arr = quickSorting(arr,0,n-1);
		
		System.out.println("The Entered Elements in Sorted Order : ");
		for(int j = 0;j < n;j++)
			System.out.print(arr[j]+" ");
	}
}

/*
Output :
	Enter the size of Sorting Elements : 
		5
		Enter the Elements to be Sorted : 
		50
		20
		10
		30
		40
		The Entered Elements in Sorted Order : 
		10 20 30 40 50 
		*/
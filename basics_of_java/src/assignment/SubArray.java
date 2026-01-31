package assignment;

import java.util.Scanner;

public class SubArray {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size:");
	int n=sc.nextInt();
	int win=0;
	int arr[]=new int[n];
	System.out.println("Enter the elements:");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<n;i++) {
		win=i;
		while(win<n)
		{
			for(i=0;i<win;i++) {
			System.out.print(arr[win]+" ");}
				System.out.println();
				win++;
				
			}
		}
	}
	}

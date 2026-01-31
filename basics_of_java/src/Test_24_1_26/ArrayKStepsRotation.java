package Test_24_1_26;

import java.util.Scanner;

public class ArrayKStepsRotation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int arr2[]=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the K steps:");
		int k=sc.nextInt();
		int a=0;
		for(int i=size-k;i<size;i++) {
			arr2[a]=arr[i];
			a++;
		}
		
		for(int i=0;i<size-k;i++) {
			arr2[a]=arr[i];
			a++;
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}

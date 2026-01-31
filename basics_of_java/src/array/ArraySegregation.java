//Write a program that segregate elements in an array consisting of only 0s and 1s. Segregating 0s and 1s in an array with all 1s appearing before 0s. 
//For example:-
//Input: {0, 1, 0, 1, 0, 0, 1, 1, 0, 1}
//Output: {1, 1, 1, 1, 1, 0, 0, 0, 0, 0}

package array;

public class ArraySegregation {
	
	public static void main(String[] args) {
		
		int arr[]= {0,1};
		int a=0;
		int l=arr.length;
		
		while(a<l && arr[a]==1)
		{
			a++;
		}
		for(int i=a+1;i<l;i++)
		{
			if(arr[i]==1)
			{
				arr[a]=1;
				arr[i]=0;
				a++;
			}
		}
		for(int j:arr)
		{
			System.out.println(j);
		}
	}
	
	

}

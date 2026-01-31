package array;

public class Max_Min {
	
	public static int max(int a[])
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
				max=a[i];}
		return max;
	}
	
	public static int min(int a[])
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
				min=a[i];}
		return min;
	}

	public static void main(String[] args) {
		
		int[] a= {5,6,3,2,1};
//		int max=a[0],min=a[0];
//		for(int i=0;i<a.length;i++)
//		{
//			if(max<a[i])
//				max=a[i];
//			if(min>a[i])
//				min=a[i];
//		}
		System.out.println(max(a)-min(a));
	}
}

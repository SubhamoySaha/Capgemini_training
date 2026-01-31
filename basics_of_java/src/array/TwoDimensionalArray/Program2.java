package array.TwoDimensionalArray;

public class Program2 {
	
	public static void print(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
 public static void main(String[] args) {
	 int [][]a= {{7,9},{4,2}};
	 int[][] b= {{1,2},{3,1}};
	 
	 System.out.println("Matrix A: ");
	 print(a);
	 System.out.println("Matrix B: ");
	 print(b);
	 
	 int[][] res=sum(a,b);
	 System.out.println("Matrix Sum: ");
	 print(res);
 }
 
 public static int[][] sum(int[][] a,int[][] b){
	 int row=a.length;
	 int col=a[0].length;
	 int[][] res=new int[row][col];
	 
	 for(int i=0;i<row;i++) {
		 for(int j=0;j<col;j++)
		 {
			 res[i][j]=a[i][j]+b[i][j];
		 }
	 }
	 return res;
}
}

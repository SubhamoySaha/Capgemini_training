package exception_demo;

public class ArrayException {

public static void main(String[] args) {
	
	int arr[]= {1,2,3,4};

System.out.println("Program started");

try {
System.out.println(arr[5]);}

catch(ArrayIndexOutOfBoundsException e) {
System.out.println("Index not present");}

////catch(RuntimeException e) {
//System. out.println(e.getMessage());}

////catch(Exception e) {
//System.out.println(e.getMessage());}

catch(Throwable e) {
System.out.println(e.getMessage());}
}
}
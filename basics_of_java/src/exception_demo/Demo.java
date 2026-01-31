package exception_demo;


public class Demo {
public static void main(String[] args) {

System.out.println("Program started");

try {
System.out.println(10/0);}

catch(ArithmeticException e) {
System.out.println("cannot divide by zero");}

////catch(RuntimeException e) {
//System. out.println(e.getMessage());}

////catch(Exception e) {
//System.out.println(e.getMessage());}

catch(Throwable e) {
System.out.println(e.getMessage());}
}
}
package assignment;

public class StaticNonStaticInitializer {


		static {
			System.out.println("static block 1");
		}
		
		{
			System.out.println("non-static block 1");
		}
		int a=demo();//non-static initializer
		public static void main(String[] args) {
			
			new StaticNonStaticInitializer();
			new StaticNonStaticInitializer(10);
			
		}
		
		{
			System.out.println("non-static block 2");
		}
		
		static {
			System.out.println("static block 2");
		}
		
		StaticNonStaticInitializer(){
			System.out.println("Program1()");
		}
		
		StaticNonStaticInitializer(int a){
			System.out.println("Program1(int a)");
		}
		
		public int demo() {
			System.out.println("demo()");
			return 10;
		}
	}



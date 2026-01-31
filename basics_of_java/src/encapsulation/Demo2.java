package encapsulation;

public class Demo2 {
	
	//private variable global var,method,Constructor
	//class Initializer not used 
	// Constructor ---> object 
	private Demo2(){
		
	}
	private int a;
	static Demo2 obj;
	// write value , read the value
	
	//method write design setter method
	//read the value design getter method
	
	public int getValueA() {
		return a;
	}
	public void setValueA(int a) {
		this.a=a;
	}
	// Factory Method
	public static Demo2 getA() {
		//return new Demo2();
		if(obj==null)
		{
			obj=new Demo2();
		}
		return obj;
	}
}


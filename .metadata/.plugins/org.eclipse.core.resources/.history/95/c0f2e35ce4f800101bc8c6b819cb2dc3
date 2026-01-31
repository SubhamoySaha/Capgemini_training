package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class HeterogenousElement {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(100);
		list.add(100.50);
		list.add("Hello");
		list.add(true);
		list.add("World");
	
		
		//Remove hello and worls using iterator
		
		Iterator<Object> itr=list.iterator(); //if it is 
		while(itr.hasNext()) {
			Object C=itr.next();
			if(C.equals("Hello") || C.equals("World"))
			{
				itr.remove();
			}
		}
		
		System.out.println(list);
	
	}
}

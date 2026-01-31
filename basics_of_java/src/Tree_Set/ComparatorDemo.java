package Tree_Set;

import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>(new MyIntegerComparator());
		ts.add(100);
		ts.add(20);
		ts.add(50);
		ts.add(300);
		ts.add(200);
		ts.add(10);
		
		System.out.println(ts);
	}
}

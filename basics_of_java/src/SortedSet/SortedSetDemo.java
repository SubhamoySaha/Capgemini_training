package SortedSet;
import Tree_Set.MyIntegerComparator;
import java.util.*;

public class SortedSetDemo {

	public static void main(String[] args) {
		
		SortedSet<Integer> ss=new TreeSet<Integer>(new MyIntegerComparator());
		ss.add(100);
		ss.add(10);
		ss.add(30);
		ss.add(40);
		ss.add(30);
		ss.add(50);
		ss.add(60);
		
		System.out.println(ss);
		
		//first()
		System.out.println("first(): "+ss.first());
	
		//last()
		System.out.println("last(): "+ss.last());
		
		//headset()
		System.out.println("headSet(): "+ss.headSet(50));
		
		//tailSet()
		System.out.println("tailSet(): "+ss.tailSet(40));
		
		//subset()
		System.out.println("subSet(): "+ss.subSet(60,30));
		
		//comparator()
		System.out.println("subSet(): "+ss.comparator());
	}
}

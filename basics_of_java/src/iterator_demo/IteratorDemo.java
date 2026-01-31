package iterator_demo;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.*;


public class IteratorDemo {
	public static void main(String[] args) {
		List arr=new ArrayList<>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.set(1, 10);
		System.out.println(arr);
		
		ArrayList list2 = new ArrayList();
		list2.add(101);
		list2.add("Hello");
		list2.add('a');
		list2.add(true);
		list2.add(100.50);
		System.out.println(list2);
		
		
		System.out.println("=====================");
		Iterator itr = list2.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}
		System.out.println("=====================");
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(100);
		list3.add(200);
		list3.add(300);
		list3.add(400);
		list3.add(500);
		
		ListIterator<Integer> itr3 = list3.listIterator();
		while (itr3.hasNext()) {
			Integer num = itr3.next();
			System.out.println(num);
		}
		System.out.println("=====================");
		while (itr3.hasPrevious()) {
			Integer num = itr3.previous();
			System.out.println(num);
		}

	}
}
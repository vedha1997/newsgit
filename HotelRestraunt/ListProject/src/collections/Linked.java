package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Linked {
	public static void main(String[] args) {
		 LinkedList list = new LinkedList();
		list.add(0,1);
		list.add(0,"vedga");
	//	System.out.println(list);
		Collection collection = new ArrayList();
		collection.add(0);
		collection.add(12);
		list.addAll(collection);
		list.addFirst(18);
		list.addLast(21);
		list.clear();
		// LinkedList list1 = new LinkedList();
			Collection collection2 = new ArrayList();
		  //list1 = (LinkedList) list.clone();
			collection2 = (LinkedList) list.clone();
		System.out.println(collection);
		System.out.println(collection2);

	}

}

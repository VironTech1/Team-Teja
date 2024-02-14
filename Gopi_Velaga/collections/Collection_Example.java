package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;


public class Collection_Example {

	public static void main(String[] args) {

		// List Interface
		System.out.println("List Operations");
		List<Integer> li = List.of(1, 2);
		System.out.println(li);
		ListIterator<Integer> listIterator = li.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		// li.add(5);

		// List created with the List.of() will be immutable
		/*
		 * [1, 2] Exception in thread "main" java.lang.UnsupportedOperationExceptio at
		 * java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
		 * at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(
		 * ImmutableCollections.java:147) at
		 * Sample/collections.Collection_Example.main(Collection_Example.java:14)
		 */
		// System.out.println(li);

		// ArrayList
		System.out.println("ArrayList Operations");
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		System.out.println(al);
		al.add(5);
		al.add(10);
		al.add(15);
		System.out.println(al);
		al.add(1, 10);
		System.out.println(al);
		al1.addAll(al);
		System.out.println(al1);
		al.clear();
		System.out.println(al);
		Object al1Clone = al1.clone();
		System.out.println(al1Clone);
		System.out.println(al1.contains(10));
		System.out.println(al1.get(1));
		al1.sort(Comparator.naturalOrder());
		System.out.println(al1);

		// Linked List
		System.out.println("LinkedList Operations");

		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(15);
		ll.add(20);
		ll.add(25);
		System.out.println(ll);
		ll.addFirst(10);
		ll.addLast(30);
		System.out.println(ll);
		ll.remove();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		
		//Set
		System.out.println("Set Operations");
		Set<Integer> s = Set.of(1,2,3);
		System.out.println(s);
		
		Iterator<Integer> si = s.iterator();
		
		while (si.hasNext()) {
			System.out.println(si.next());
		}
		
		//Hashset
		System.out.println("HashSet Operations");
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(15);
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		
		//TreeSet
		System.out.println("TreeSet Operations");
		
		TreeSet ts = new TreeSet();
		ts.add('a');
		ts.add('d');
		ts.add('c');
		//THe following gives you the exception ecause it canot compare two different types of data
		//It canot compare and null values are also not allowed
		//TreeSet is only collection that canot have heterogenious data in it
		//ts.add("Hello");
		ts.add('d');
		ts.add('b');
		System.out.println(ts);
		
		//Queue
		
		
		
	}

}

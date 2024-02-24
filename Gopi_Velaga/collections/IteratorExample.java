package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(10);

		Iterator it = al.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		;
	}

}

package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(100);
		al.add("Sumit");
		al.add(25.5);
		al.add('A');

		System.out.println(al);

		System.out.println(al.size());

		al.remove("Sumit");

		System.out.println(al);

		al.add(2, "Sumit");

		System.out.println(al);

		// Retrieve specific Element

		System.out.println(al.get(3));

		// Change and replace element
		al.set(2, "Amit");
		System.out.println(al);

		// search

		al.contains("Amit");
		System.out.println(al);

		// isEmpety()
		System.out.println(al.isEmpty());

		// Read the all element in array list

		for (Object e : al) {

			System.out.println(e);
		}

		for (int i = 0; i < al.size(); i++) {

			System.out.println(al.get(i));
		}

		// Iterator

		Iterator it = al.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}
		
//		Collections.sort(al);
//		Collections.sort(al, Collections.reverseOrder());
//		Collections.shuffle(al);
		
		// Convert array into array list
		
		String arr[] = {"a", "b", "c"};
		
		
		
		ArrayList al1 = new ArrayList(Arrays.asList(arr));
		
		System.out.println(al1);

	}

}

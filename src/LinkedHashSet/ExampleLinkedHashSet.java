package LinkedHashSet;

import java.util.LinkedHashSet;

/**
 * @author sumitagnihotri
 * 
 * -> Duplicate not allowed
 * -> Insertion Order is preserve(Same order)
 * -> default load factor is 0.76
 *
 */
public class ExampleLinkedHashSet {
	
	

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("Sumit");
		lhs.add("S");
		lhs.add(1000);
		
		System.out.println(lhs);
		 
	}

}

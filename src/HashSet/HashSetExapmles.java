package HashSet;

import java.util.HashSet;

/**
 * @author sumitagnihotri
 * 
 * Hash Set : Group of object in a single Entity
 * -> Duplicate not allowed
 * -> insertion order is not preserved(Random)
 * -> HashCode(Element add)
 * -> Heterogeneous data supported
 * -> Null also supported
 *
 */
public class HashSetExapmles {
	

	public static void main(String[] args) {
		 

		HashSet hs = new HashSet();
		
		hs.add("Sumit");
		hs.add(1000);
		
		System.out.println(hs);
	}

}

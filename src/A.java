import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

import org.w3c.dom.ls.LSOutput;

public class A {
	public static void main(String[] args) {
		List<Integer> names = new ArrayList<>();
		names.add(1);
		names.add(2);
		names.add(3);
		names.add(4);
		List<Integer> vector = new Vector<>();
		vector.addAll(names);
		
		  
		  for (Integer i : names) { System.out.println(i); }
		 
		System.out.println(names);
		System.out.println(names.isEmpty());
		System.out.println(names.contains(2));
		System.out.println(names.contains(7));
		System.out.println(vector);
		
		HashSet<Double> hashset=new HashSet<>();
		hashset.add(14.999);
		hashset.add(17.999);
		hashset.add(19.999);
		System.out.println(hashset);
		TreeSet<Double> treeset=new TreeSet<>();
		treeset.addAll(hashset);
		System.out.println(treeset);
		

	}

}

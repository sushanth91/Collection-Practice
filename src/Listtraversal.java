import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class Listtraversal {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("Durgesh");
		names.add("new");
		names.add("mithun");
		for(String str:names) {
		System.out.print(str+"\t"+str.length()+"\t");
		StringBuffer br = new StringBuffer(str);
		System.out.println(br.reverse());
		}
		System.out.println("--------------------------------------");
		//Traversing through Iterator: Forword traversing. Iterator is an interface.
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()) 
		{
			String next=iterator.next();
			System.out.println(next);
		}
		System.out.println("--------------------------------------");
		// Backward traversing
		ListIterator<String> listIterator = names.listIterator(names.size());
		while(listIterator.hasPrevious()) 
		{
			String previous=listIterator.previous();
			System.out.println(previous);
		}
		System.out.println("----------forEach()----------------");
		//for each method From e you will get all elements
		names.forEach(e->{
			System.out.println(e);
		});
		System.out.println("----------Sorting Of Elements----------------");
		TreeSet<String> treeset=new TreeSet<>();
		treeset.addAll(names);
		treeset.forEach(e->{
			System.out.println(e);
		});
		
		
	
		
	}
}

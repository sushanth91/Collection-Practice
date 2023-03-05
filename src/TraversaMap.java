import java.util.HashMap;

public class TraversaMap {
public static void main(String[] args) {
	HashMap<String, Integer> courses=new HashMap<>();
	courses.put("Core Java", 4000);
	courses.put("Basic Python", 3500);
	courses.put("Spring", 8000);
	courses.put("Android", 4000);
	System.out.println(courses);
	System.out.println();
	System.out.println("---------------Traversal using forEach()----------------");
	courses.forEach((key,value)->{
		System.out.print(key);
		System.out.print("==>");
		System.out.println(value);
	});
	System.out.println();
	System.out.println("---------------Traversal using forEach()----------------");
	courses.forEach((e1,e2)->{
		System.out.println(e1+"==>"+e2);
	});
}
}

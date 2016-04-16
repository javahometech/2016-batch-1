import java.util.ArrayList;
import java.util.List;

public class A {
	public static void main(String[] args) {
//		Adding Objects into List
		List li = new ArrayList();
		li.add("Java");
		li.add("Hadoop");
		li.add("Selenium");
		li.add("Java");
		li.add(1,"Android");
		
//		Retrieving Objects from List
		for (Object x : li) {
			System.out.println(x);
		}
		
	}
}

import java.util.ArrayList;
import java.util.List;

public class H {
	public static void main(String[] args) {
//		Adding Objects into List
		List li1 = new ArrayList();
		li1.add("Java");
		li1.add("Hadoop");
		li1.add("Selenium");
		
		List l2 = new ArrayList();
		l2.add("Java");
		l2.add(1,"Android");
		
		li1.addAll(l2);
		
		
//		Retrieving Objects from List
		for (Object x : li1) {
			System.out.println(x);
		}
		
	}
}

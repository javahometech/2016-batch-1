import java.util.ArrayList;
import java.util.List;

public class J {
	public static void main(String[] args) {
//		Adding Objects into List
		List li = new ArrayList();
		li.add("Java");
		li.add("Hadoop");
		li.add("Selenium");
		li.add("Java");
		li.add("Android");
		
		List subLIst = li.subList(0, 3);
		
//		Retrieving Objects from List
		for (Object x : subLIst) {
			System.out.println(x);
		}
		
	}
}

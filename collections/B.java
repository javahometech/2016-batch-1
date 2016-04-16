import java.util.LinkedList;
import java.util.List;

public class B {
public static void main(String[] args) {
	List ll = new LinkedList();
	ll.add("Java");
	ll.add("Hadoop");
	ll.add(100);
	ll.add("Java");
	ll.add(new Double(10.5));
	
	for (Object x : ll) {
		System.out.println(x);
	}
}
}

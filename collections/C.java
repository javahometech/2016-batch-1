import java.util.List;
import java.util.Vector;

public class C {
public static void main(String[] args) {
	List ll = new Vector();
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

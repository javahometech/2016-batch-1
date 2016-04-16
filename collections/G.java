import java.util.Set;
import java.util.TreeSet;

public class G {
	public static void main(String[] args) {
		Set s = new TreeSet();
		s.add("India");
		s.add("Russia");
		s.add("Belgium");
		s.add("Australia");
		s.add("India");
		for (Object x : s) {
			System.out.println(x);
		}
	}
}

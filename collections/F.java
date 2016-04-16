import java.util.LinkedHashSet;
import java.util.Set;

public class F {
	public static void main(String[] args) {
		Set s = new LinkedHashSet();
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

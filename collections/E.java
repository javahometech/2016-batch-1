import java.util.HashSet;
import java.util.Set;

public class E {
	public static void main(String[] args) {
		Set s = new HashSet();
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

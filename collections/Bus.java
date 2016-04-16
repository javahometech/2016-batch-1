import java.util.HashSet;
import java.util.Set;

public class Bus {
	String name;
	public Bus(String name) {
		this.name = name;
	}
	public boolean equals(Object obj) {
		Bus b2 = (Bus)obj;
		return name.equals(b2.name);
	}
	public int hashCode() {
	  return name.hashCode();
	}
	public static void main(String[] args) {
		Set s = new HashSet();
		Bus b1 = new Bus("Volvo");
		Bus b2 = new Bus("Ordinary");
		Bus b3 = new Bus("Volvo");
		
		s.add(b1);
		s.add(b2);
		s.add(b3);
		
		for (Object obj : s) {
			Bus b = (Bus)obj;
			System.out.println(b.name);
		}
	}
}

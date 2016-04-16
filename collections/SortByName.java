import java.util.Comparator;

public class SortByName implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Book b1 = (Book)o1;
		Book b2 = (Book)o2;
		return b1.name.compareTo(b2.name);
	}

}

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookSortMain {
public static void main(String[] args) throws IOException {
	System.out.println("Enter 1 for sort by name");
	System.out.println("Enter 2 for sort by cost");
	Scanner s = new Scanner(System.in);
	int i = s.nextInt();
	System.out.println(i);
	Set s1 = null;
	if(i==1){
		s1 = new TreeSet(new SortByName());
	}else{
		s1 = new TreeSet(new SortByCost());
	}
	s1.add(new Book("Java", 750.0));
	s1.add(new Book("Hadoop", 950.0));
	s1.add(new Book("Selenium", 350.0));
	s1.add(new Book("Android", 550.0));
	for (Object object : s1) {
		Book x = (Book)object;
		System.out.println(x.name +" --> "+x.cost);
	}
}
}

import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable{
	String name;
	Integer age;

	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	public int compareTo(Object o) {
		Student s2 = (Student)o;
		return this.name.compareTo(s2.name);
	}
	
	public static void main(String[] args) {
		Set students = new TreeSet();
		students.add(new Student("Kiran",26));
		students.add(new Student("Babu",24));
		students.add(new Student("Amar",26));
		students.add(new Student("Prasad",30));
		
		for (Object obj : students) {
			Student s = (Student)obj;
			System.out.println(s.name+" --> "+s.age);
		}
	}

	
}

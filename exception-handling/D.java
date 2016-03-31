public class D {
	public static void main(String[] args) {
		System.out.println("A");
		int i = 10/0;
		try {
			System.out.println("B");
		} catch (Exception e) {
			System.out.println("C");
		}
	}
}

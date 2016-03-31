public class B {
	public static void main(String[] args) {
		try {
			System.out.println("A");
			int i = 10 / 0;
			System.out.println("B");
		} catch (Exception e) {
			System.out.println("C");
		}
	}
}

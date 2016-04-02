public class F {
	public static void main(String[] args) {
		try {
			System.out.println("A");
			 int i = 10/1;
			System.out.println("B");
 		} catch (Exception e) {
 			System.out.println("C");
		} finally {// this code is executed always
			System.out.println("D");
		}

	}
}

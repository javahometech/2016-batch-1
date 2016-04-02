
public class G {
	static int doStuff(int i) {
		i++;// 6
		try {
			i++;//7
			return i++;// 8 
		} catch (Exception e) {
			i++;
		} finally {
			return i++;//9
		}
	}
	public static void main(String[] args) {
		int r = doStuff(6);
		System.out.println(r);
	}
}

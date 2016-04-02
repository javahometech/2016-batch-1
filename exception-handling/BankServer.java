
public class BankServer {
	void validatePin(int pin) throws Exception {
		if (pin < 0) {
			throw new Exception("Invalid Pin ");
		}
	}

	public static void main(String[] args) {
		BankServer server = new BankServer();
		try {
			server.validatePin(-1234);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

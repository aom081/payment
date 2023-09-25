package strategyPattem;

public class TestDiver {

	public static void main(String[] args) {
		shoppingCart cart1 = new shoppingCart();
		cart1.checkout(1500);
		cart1.setPaymentStrategy(new CrediccardPayment());
		cart1.checkout(2000);
		cart1.setPaymentStrategy(new ScanPayment());
		cart1.checkout(10000);
		
	}

}

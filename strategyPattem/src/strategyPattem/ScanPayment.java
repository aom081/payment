package strategyPattem;

public class ScanPayment implements PaymentStrategy{
	 
	@Override
	public void pay(int amount) {
		System.out.println("Paid by Scan QR code:" + amount);
	}
		
}
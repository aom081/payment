package strategyPattem;

public class shoppingCart {
	private PaymentStrategy paymentStrategy;
	
	public shoppingCart() {
		this.paymentStrategy = new CashPayment();
	}
	
	public void setPaymentStrategy(PaymentStrategy strategy) {
		this.paymentStrategy = strategy;
	}
	
	public void checkout(int amount) {
		paymentStrategy.pay(amount);
	}
}

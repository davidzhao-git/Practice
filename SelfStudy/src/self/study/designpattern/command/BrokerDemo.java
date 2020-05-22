package self.study.designpattern.command;

// Broker class to take and execute commands 
public class BrokerDemo {

	public static void main(String[] args) {
		
		Stock fb = new Stock("FB", 100); 
		Stock aapl = new Stock("AAPL", 200); 
		
		Order buyFB = new BuyStockOrder(fb);
		Order sellFB = new SellStockOrder(fb);
		
		Order buyAAPL = new BuyStockOrder(aapl);
		Order sellAAPL = new SellStockOrder(aapl);
		
		Broker broker = new Broker();
		broker.takeOrder(buyFB);
		broker.takeOrder(sellFB);
		broker.takeOrder(buyAAPL);
		broker.takeOrder(sellAAPL);
		
		broker.placeOrder();
	}

}

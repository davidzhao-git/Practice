package self.study.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

	// collection of commands
	private List<Order> orderList = new ArrayList<Order>(); 
	
	public void takeOrder(Order order) {
		orderList.add(order);
	}
	
	public void placeOrder() {
		
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
	
}

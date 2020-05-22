package self.study.designpattern.observer;

public class Demo {

	public static void main(String[] args) {
		
		Investor jack = new Individual("Jack"); 
		Investor goldmanSachs = new Institution("Goldman Sachs"); 
		Investor jpMorgan = new Institution("JP Morgan"); 
		
		AppleStock aapl = new AppleStock(); 
		aapl.attach(jack);
		aapl.attach(goldmanSachs);
		aapl.attach(jpMorgan);
		
		aapl.setClosingPrice(210.95);
		
		aapl.detach(jack);
		aapl.setClosingPrice(211.47);
	}

}

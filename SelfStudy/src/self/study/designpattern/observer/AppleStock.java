package self.study.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class AppleStock implements IObservable {

	private double closingPrice; 
	
	private List<Investor> investorList = new ArrayList<Investor>(); 
	
	@Override
	public void attach(Investor investor) {		
		investorList.add(investor);
	}

	@Override
	public void detach(Investor investor) {
		investorList.remove(investor);
	}

	@Override
	public void notifyObervers() {
		for (Investor investor : investorList) {
			investor.update();
			System.out.println("Closing Price for AAPL: " + closingPrice); 
		}
		System.out.println();
	}

	public void setClosingPrice(double closingPrice) {
		this.closingPrice = closingPrice;
		notifyObervers();
	}
	
}

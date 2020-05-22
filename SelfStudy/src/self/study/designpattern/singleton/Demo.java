package self.study.designpattern.singleton;

public class Demo {

	public static void main(String[] args) {
		
		FilingCabinet filingCabinet = FilingCabinet.getInstance();
		filingCabinet.printCabinet();
		
		FilingCabinet filingCabinet2 = FilingCabinet.getInstance();
		filingCabinet2.printCabinet();

		System.out.println(filingCabinet);
		System.out.println(filingCabinet2);
		
		// cannot do this because the constructor is private
		// FilingCabinet cab = new FilingCabinet();

	}
}

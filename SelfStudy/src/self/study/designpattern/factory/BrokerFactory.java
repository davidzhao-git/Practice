package self.study.designpattern.factory;

public class BrokerFactory extends UserFactory {

	@Override
	public User createUser() {
		return new Broker(); 
	}

}

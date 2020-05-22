package self.study.designpattern.factory;

public class AdminFactory extends UserFactory {

	@Override
	public User createUser() {
		return new Admin();
	}
}

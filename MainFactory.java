package MediatoraAndFactory;

public class MainFactory {
	private User name;



	public MainFactory() {
		new FactoryBot();
		new FactoryUser();
	}



	public User newUser(String string) {
		new FactoryUser();
		return name;
	}

	public User createUser(String string) {
		new FactoryUser();
		return name;
	}
}

package MediatoraAndFactory;

public class Main {

	public static void main(String[] args) {
		MainFactory factory = new MainFactory();
		User firstUser = factory.createUser("IVAN");
		User secondUser = factory.createUser("IVANA");
		User thirdUser = factory.createUser("MRIYA");
		User anotherUser = factory.createUser("PETRA");

		Room.addUser(firstUser);
		Room.addUser(secondUser);
		Room.addUser(thirdUser);
		
		firstUser.sendMessage("Hello!");
		secondUser.sendMessage("Hi !");
		thirdUser.sendMessage("Hi !");
		anotherUser.sendMessage("Hi!");
		firstUser.sendMessage("cats");
		secondUser.sendMessage("addBot");
		thirdUser.sendMessage(" I have a cat at home!");
		thirdUser.sendMessage("Do you have cats?");




	}

}

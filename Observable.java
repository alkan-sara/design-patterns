package Observer;

public class Observable {
	private String training;
	
	public void setTraining(String training)
	{
		this.training = training;
		System.out.println("Viewer get a new command "+ this.training);

	}

	public String getUpdate() {
		// TODO Auto-generated method stub
		return null;
	}

}
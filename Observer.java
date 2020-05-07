package Observer;

public interface Observer {
	public void update();
	public void setTrainee(Observer observer);
	void notifyObservers();
	public String getUpdate();
	void setTrainee1(Observer observer);
	void subscribe(Observer observer);
	void unsubscribe(Observer observer);
	
}
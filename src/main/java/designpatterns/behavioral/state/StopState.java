package main.java.designpatterns.behavioral.state;

public class StopState implements State{

	@Override
	public void handle(Context context) {
		System.out.println("Implementing stop state.");
		context.setState(this);
	}

}

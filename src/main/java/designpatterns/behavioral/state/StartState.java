package main.java.designpatterns.behavioral.state;

public class StartState implements State{

	@Override
	public void handle(Context context) {
		System.out.println("Implementing start state");
		context.setState(this);
	}

}

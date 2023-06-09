package main.java.designpatterns.behavioral.state;

public class Context {

	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void handle() {
		state.handle(this);
	}
}

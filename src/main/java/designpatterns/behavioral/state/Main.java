package main.java.designpatterns.behavioral.state;

public class Main {

	public static void main(String[] args) {
		Context context = new Context();
		context.setState(new StartState());
		context.handle();
		
		context.setState(new StopState());
		context.handle();

	}

}

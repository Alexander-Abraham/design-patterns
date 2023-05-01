package main.java.designpatterns.behavioral.memento;

public class Originator {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public Memento saveStateToMemento() {
        return new Memento(content);
    }

    public void getStateFromMemento(Memento memento) {
    	content = memento.getContent();
    }
	
}

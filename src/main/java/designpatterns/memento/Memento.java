package main.java.designpatterns.memento;

public class Memento {
	private String content;

	public Memento(String content) {
		this.content=content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}

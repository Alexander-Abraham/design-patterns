package main.java.designpatterns.memento;

public class Main {

	private static Integer i;
	public static void main(String[] args) {
		Originator originator= new Originator();
		Caretaker caretaker = new Caretaker();
		originator.setContent("a");
		caretaker.add(originator.saveStateToMemento());
		originator.setContent("b");
		caretaker.add(originator.saveStateToMemento());
		originator.setContent("c");
		caretaker.add(originator.saveStateToMemento());
		originator.setContent("d");
		caretaker.add(originator.saveStateToMemento());
		originator.setContent("e");
		caretaker.add(originator.saveStateToMemento());
		
		System.out.println(undo(caretaker));
		System.out.println(redo(caretaker));
		System.out.println(redo(caretaker));
		System.out.println(undo(caretaker));
		System.out.println(redo(caretaker));
	}
	
	private static String undo(Caretaker caretaker) {
		if(i==null) {
			i= caretaker.getMemetoSize();
		}
		try {
			Memento memento = caretaker.get(i-2);
			i=i-1;
			return memento.getContent();
		}catch(IndexOutOfBoundsException ex) {
			return "";
		}
	}
	
	private static String redo(Caretaker caretaker) {
		try {
			Memento memento = caretaker.get(i);
			i=i+1;
			return memento.getContent();
		}catch(IndexOutOfBoundsException | NullPointerException ex) {
			return "";
		}
		
		
	}

}

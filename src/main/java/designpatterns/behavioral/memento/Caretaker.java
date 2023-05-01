package main.java.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento content) {
        mementoList.add(content);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
    
    public int getMemetoSize() {
    	return mementoList.size();
    }
}

package main.java.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList implements Aggregate{

	private List<String> elements = new ArrayList<>();
	
	private int size;
	
	public void add(String element) {
		elements.add(element);
		size++;
	}
	
	public String get(int index) {
		return elements.get(index);
	}
	
	public int getSize() {
		return this.size;
	}

	@Override
	public Iterator createIterator() {
		return new MyArrayListIterator(this);
	}
	
}

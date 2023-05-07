package main.java.designpatterns.behavioral.iterator;

public class Main {

	public static void main(String[] args) {
		MyArrayList array = new MyArrayList();
		array.add("a");
		array.add("b");
		array.add("c");
		array.add("d");
		array.add("e");
		Iterator it = array.createIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

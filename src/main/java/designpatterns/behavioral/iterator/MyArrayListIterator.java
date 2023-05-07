package main.java.designpatterns.behavioral.iterator;

public class MyArrayListIterator implements Iterator{

	private MyArrayList myArrayList;
	
	private int index;
	
	public MyArrayListIterator(MyArrayList myArrayList) {
		this.myArrayList=myArrayList;
		this.index=0;
	}
	
	@Override
	public boolean hasNext() {
		return index < myArrayList.getSize();
	}

	@Override
	public Object next() {
		Object obj = myArrayList.get(index);
		index++;
		return obj;
	}

}

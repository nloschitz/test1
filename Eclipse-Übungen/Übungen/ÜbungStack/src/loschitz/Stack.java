package loschitz;

public class Stack<E> {
	
	private Object[] elements;
	private int nextFreeIndex;
	
	public Stack (int size){
		elements = new Object[size];
		nextFreeIndex = 0;
	}
	
	public void push (E e){
		elements[nextFreeIndex] = e;
		nextFreeIndex ++;
	}
	
	public E pop (){
		
	}
}

package cs271.hw.liststackqueue.interfaces;

public interface SimpleStack<T> extends SimpleCollection{
	public void push(T item);
	public T pop();
}

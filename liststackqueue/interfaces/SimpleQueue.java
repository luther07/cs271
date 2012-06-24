package cs271.hw.liststackqueue.interfaces;

public interface SimpleQueue<T> extends SimpleCollection {
	public void enqueue(T item);
	public T dequeue();
}

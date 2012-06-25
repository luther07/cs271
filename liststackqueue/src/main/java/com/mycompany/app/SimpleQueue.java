package com.mycompany.app;

public interface SimpleQueue<T> extends SimpleCollection {
	public void enqueue(T item);
	public T dequeue();
}

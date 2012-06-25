package com.mycompany.app;

public interface SimpleStack<T> extends SimpleCollection{
	public void push(T item);
	public T pop();
}

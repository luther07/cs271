package com.mycompany.app;
/**HW-3, CS271
 * @author Mark Johnson
 *SimpleStackImpl class
 */
import cs271.hw.liststackqueue.interfaces.SimpleStack;

public class SimpleStackImpl<T> implements SimpleStack<T> {

	private SinglyLinkedList<T> list = new SinglyLinkedList<T>();

	/**pop method removes the element on the end of the stack;
	 * @return the element on the end of the list;
	 */
	public T pop() {
		return (list.remove(list.size()-1));
	}

	/**push method adds a new element at the end of the stack;
	 * @return void;
	 */
	public void push(T item){
		list.add(item);
	}

	/**isEmpty method returns true if the stack is empty;
	 * @return true or false if the stack is empty or not empty;
	 */
	public boolean isEmpty(){
		return (list.isEmpty());
	}

	/**size method returns the size of the stack, an int;
	 * @return the size or number of elements in the stack, an int;
	 */
	public int size(){
		return list.size();
	}



}

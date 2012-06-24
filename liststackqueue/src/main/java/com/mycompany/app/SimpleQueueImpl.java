package cs271.hw.liststackqueue;
/**HW-3, CS271
 * @author Mark Johnson
 *SimpleQueueImpl class
 */
import cs271.hw.liststackqueue.interfaces.SimpleQueue;

public class SimpleQueueImpl<T> implements SimpleQueue<T> {

	private SinglyLinkedList<T> list = new SinglyLinkedList<T>();
	
	/**dequeue method removes the element that head points to in the queue;
	 * @return the element that head points to on the queue;
	 * returns null if the queue is empty when the method is called;
	 */	
	public T dequeue() {
		return list.remove(0);
	}

	/**enqueue method adds a new element at the end of the queue;
	 * @return void;
	 */	
	public void enqueue(T item) {
		list.add(item);
	}

	/**isEmpty method returns true if the queue is empty;
	 * @return true or false if the queue is empty or not empty;
	 */	
	public boolean isEmpty() {
		return(list.isEmpty());
	}

	/**size method returns the size of the queue, an int;
	 * @return the size or number of elements in the queue, an int;
	 */	
	public int size() {
		return list.size();
	}

}

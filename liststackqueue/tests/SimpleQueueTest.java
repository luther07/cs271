package cs271.hw.liststackqueue.tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import cs271.hw.liststackqueue.SimpleQueueImpl;
import cs271.hw.liststackqueue.interfaces.SimpleQueue;

public class SimpleQueueTest {

	SimpleQueue<Integer> queue;
	
	@Before
	public void setUp() throws Exception {
		queue = new SimpleQueueImpl<Integer>();
	}
	
	@Test
	public void testInitialConditions() throws Exception {
		assertTrue(queue.isEmpty());
		assertEquals(0, queue.size());
		assertNull(queue.dequeue());
	}
	
	
	@Test
	public void testPushAndPop() throws Exception {
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		assertEquals(3, queue.size());
		assertFalse(queue.isEmpty());
		
		assertEquals(1, queue.dequeue());
		assertEquals(2, queue.dequeue());
		assertEquals(3, queue.dequeue());
		
		assertTrue(queue.isEmpty());
		assertEquals(0, queue.size());
		assertNull(queue.dequeue());
	}

}

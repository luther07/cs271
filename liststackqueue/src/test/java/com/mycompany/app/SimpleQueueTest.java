package com.mycompany.app;


//import static junit.framework.Assert.assertEquals;
//import static junit.framework.Assert.assertFalse;
//import static junit.framework.Assert.assertNull;
//import static junit.framework.Assert.assertTrue;
//import junit.framework.Assert;

//import junit.framework.Before;
//import junit.framework.Test;

import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;

import com.mycompany.app.SimpleQueueImpl;
import com.mycompany.app.SimpleQueue;

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

		assertEquals((Integer)1, queue.dequeue());
		assertEquals((Integer)2, queue.dequeue());
		assertEquals((Integer)3, queue.dequeue());

		assertTrue(queue.isEmpty());
		assertEquals(0, queue.size());
		assertNull(queue.dequeue());
	}

}

package cs271.hw.liststackqueue.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import cs271.hw.liststackqueue.SimpleStackImpl;
import cs271.hw.liststackqueue.interfaces.SimpleStack;

public class SimpleStackTest {

SimpleStack<Integer> stack;
	
	@Before
	public void setUp() throws Exception {
		stack = new SimpleStackImpl<Integer>();
	}
	
	@Test
	public void testInitialConditions() throws Exception {
		assertTrue(stack.isEmpty());
		assertEquals(0, stack.size());
		assertNull(stack.pop());
	}
	
	
	@Test
	public void testPushAndPop() throws Exception {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		assertEquals(3, stack.size());
		assertFalse(stack.isEmpty());
		
		assertEquals(3, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(1, stack.pop());
		
		assertTrue(stack.isEmpty());
		assertEquals(0, stack.size());
		assertNull(stack.pop());
	}

}

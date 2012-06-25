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

import com.mycompany.app.SimpleStackImpl;
import com.mycompany.app.SimpleStack;

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

		assertEquals((Integer)3, stack.pop());
		assertEquals((Integer)2, stack.pop());
		assertEquals((Integer)1, stack.pop());

		assertTrue(stack.isEmpty());
		assertEquals(0, stack.size());
		assertNull(stack.pop());
	}

}

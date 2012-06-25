package com.mycompany.app;


//import static junit.framework.Assert.assertEquals;
//import static junit.framework.Assert.assertNull;
//import junit.framework.Assert;

//import junit.framework.Before;
//import junit.framework.Test;

import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SinglyLinkedListTest {

    private final static String ELEMENT_1 = "one";
    private final static String ELEMENT_2 = "two";
    private final static String ELEMENT_3 = "three";

    private SinglyLinkedList<String> list;

	@Before
	public void setUp() throws Exception {
        list = new SinglyLinkedList<String>();
   	}

	@Test
	public void testInitialConditions() throws Exception {
		//make sure the list starts out empty
		assertEquals(0, list.size());
		assertEquals(true, list.isEmpty());
	}

	@Test
    public void testAddGetAndSize() {
    	//add, get, and size methods are all tested here:
    	list.add(ELEMENT_1);
    	list.add(ELEMENT_2);
    	list.add(ELEMENT_3);

    	assertEquals(3, list.size());
    	assertEquals(false, list.isEmpty());

    	assertEquals(ELEMENT_1, list.get(0));
    	assertEquals(ELEMENT_2, list.get(1));
    	assertEquals(ELEMENT_3, list.get(2));

    	//out of bounds attempts to remove should return null
    	assertNull(list.get(5));
    	assertNull(list.get(-1));
    }

	@Test
    public void testRemove() {
    	list.add(ELEMENT_1);
    	list.add(ELEMENT_2);
    	list.add(ELEMENT_3);

    	assertEquals(ELEMENT_2, list.remove(1));

        assertEquals(2, list.size());
        assertEquals(ELEMENT_1, list.get(0));
        assertEquals(ELEMENT_3, list.get(1));

        assertEquals(ELEMENT_3, list.remove(1));
        assertEquals(1, list.size());
        assertEquals(ELEMENT_1, list.get(0));

        assertEquals(ELEMENT_1, list.remove(0));
        assertEquals(0, list.size());
        assertNull(list.get(0));

        //out of bound attempts to remove should return null
        assertNull(list.remove(0));
        assertNull(list.remove(1));
        assertNull(list.remove(-1));
    }
}

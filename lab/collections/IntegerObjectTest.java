package cs271.lab.collections;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class IntegerObjectTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testEquals() throws Exception {
		IntegerObject one = new IntegerObject(1);
		IntegerObject two = new IntegerObject(2);
		IntegerObject oneB = new IntegerObject(1);
		
		assertEquals(one, oneB);
		assertFalse(one.equals(two));
		assertFalse(two.equals(one));
	}
	
	@Test
	public void testCompareTo() throws Exception {
		IntegerObject one = new IntegerObject(1);
		IntegerObject two = new IntegerObject(2);
		IntegerObject oneB = new IntegerObject(1);
		
		assertEquals(0, one.compareTo(oneB));
		assertEquals(-1, one.compareTo(two));
		assertEquals(1, two.compareTo(one));
	}

}

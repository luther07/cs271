package cs271.lab.collections;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testWithIntegerObject() throws Exception {
		ListUtil<IntegerObject> listUtil = new ListUtil<IntegerObject>();
		
		List<IntegerObject> list = new ArrayList<IntegerObject>();
		list.add(new IntegerObject(1));
		list.add(new IntegerObject(5));
		list.add(new IntegerObject(4));
		
		IntegerObject max = listUtil.findMax(list);
		
		assertEquals(5, max.getInt());
		assertEquals(new IntegerObject(5), max);
	}
	
	@Test
	public void testWithString() throws Exception {
		ListUtil<String> listUtil = new ListUtil<String>();
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("A");
		list.add("B");
		list.add("C");
		
		String max = Collection.max(list);
		
		assertEquals("a", max);
	}

}

package howard_lsp_assignments.org.howard.edu.lsp.assignment5;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


public class IntegerSetTest {  //
	
	private IntegerSet set; //
	
	@Before
	public void setUp() { //
		ArrayList<Integer>list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(8);
		list.add(2);
		list.add(18);
		set = new IntegerSet(list);
	}

  
    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        set.clear();
        assertEquals(0, set.length());
        assertEquals(set.length(), 0);
    }
    
    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        assertEquals(5, set.length());
    }
     

	@Test
	@DisplayName("Test case for equals")
	public void testEquals() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(4);
		
		IntegerSet set2 = new IntegerSet(list);
		assertFalse(set.equals(set2));
	}

	@Test
	public void testContains() {

	}
	
	@Test
	@DisplayName("Test case for largest")
	public void testLargest() throws IntegerSetException {
        assertEquals(18, set.largest());
    }
    
    @Test(expected = IntegerSetException.class)
    @DisplayName("Test case for largest exception")
    public void testLargestException() throws IntegerSetException {
        set.clear();
        set.largest();
    }
    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() throws IntegerSetException {
        assertEquals(2, set.smallest());
    }
    
    @Test(expected = IntegerSetException.class)
    @DisplayName("Test case for smallest exception")
    public void testSmallestException() throws IntegerSetException {
        set.clear();
        set.smallest();
    
	}

	@Test
	@DisplayName("Test case for Add")
	public void testAdd() {
		set.addItem(10);
		set.addItem(39);
		assertEquals(7, set.length());
	}

	@Test
	@DisplayName("Test case for Remove")
	public void testRemove() {
	set.removeItem(5);
	assertEquals(4, set.length());
	}

	@Test
	@DisplayName("Test case for Union")
	public void testUnion() {		//
		ArrayList<Integer>list = new ArrayList<Integer>();
		list.add(20);
		list.add(21);
		list.add(22);
		IntegerSet set2 = new IntegerSet(list);
		IntegerSet set3 = set.union(set2);
		assertEquals(8, set3.length());
	}

	@Test
	@DisplayName("Test case for Intersect")
	public void testIntersect() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(6);
		list.add(10);
		IntegerSet set2 = new IntegerSet(list);
		IntegerSet result = set.intersection(set2);
		assertEquals(1, result.length());
	}

	@Test
	@DisplayName("Test case for Difference")
	public void testDiff() {
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        IntegerSet set2 = new IntegerSet(list);
        IntegerSet result = set.diff(set2);
        assertEquals(4, result.length());
	}

	@Test
	@DisplayName("Test case for Complement")
	public void testComplement() {
		ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(3);
			list.add(5);
			list.add(8);
			list.add(2);
		
        IntegerSet set2 = new IntegerSet(list);
        IntegerSet result = set.diff(set2);
        assertEquals(1, result.length());
       
	
	}

	@Test
	@DisplayName("Test case for isEmpty")
	public void testIsEmpty() {
		set.clear();
		assertTrue(0 == set.length());
		set.addItem(3);
		assertFalse(0 == set.length());
	}

	@Test
	@DisplayName("Test case for toString")
	public void testToString() {
		assertEquals("[3, 5, 8, 2, 18]", set.toString());
	}

}

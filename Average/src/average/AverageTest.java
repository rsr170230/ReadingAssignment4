package average;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
//import junit.framework.TestSuite;

class AverageTest extends TestCase {
	int[] list = {1, 2, 3, 4, 5, 3, 2, 1, 0};
	int[] emptyList = {};
	Average test = new Average();
	
	//test Average When K is Zero
	@Test
	void testCase1() {
	    double result = test.average(0, list);
	    assertEquals(0.0, result);
	}
	
	//test Average When K is Lesser Than Zero
	@Test
	void testCase2() {
	    double result = test.average(-3, list);
	    assertEquals(0.0, result);
	}
	
	//test Average When K is Lesser Than List Length
	@Test
	void testCase3_1() {
	    double result = test.average(2, list);
	    assertEquals(1.5, result);
	}
	
	//test Average When List is Empty
	@Test	
	void textCase3_2_1() {
	    double result = test.average(15, emptyList);
	    assertEquals(0.0, result);
	}
	
	//test Average When K is Greater Than List Length
	@Test	
	void testCase3_2_2() {
	    double result = test.average(15, list);
	    assertEquals(2.3333333333333335, result);
	}
	
	//test Average When List is Empty and K is List Length
	@Test	
	void testCase3_3_1() {
	    double result = test.average(emptyList.length, emptyList);
	    assertEquals(0.0, result);
	}
	
	//test Average When K is List Length
	@Test	
	void testCase3_3_2() {
	    double result = test.average(list.length, list);
	    assertEquals(2.3333333333333335, result); 
	}
	
	//when k = 1
	@Test	
	void boundaryCase1() {
	    double result = test.average(1, list);
	    assertEquals(1.0, result);
	}
	
	//Boundary cases 2 and 3 are covered in the previous test cases
	
	//k = list.length + 1
	@Test	
	void boundaryCase4() {
	    double result = test.average(list.length + 1, list);
	    assertEquals(2.3333333333333335, result); 
	}
	
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;

import org.junit.jupiter.api.Test;

public class testcase2 {
	
	private static calc calculator;
	
	@BeforeClass 
	public static void setup() {
		calculator = new calc();
	}

	@Test
	public void testadd() {
		assertEquals(8,calculator.add(5, 3));
	}
	
	@Test
	public void testSub() {
		assertEquals(6, calculator.sub(9,3));
	}
	@Test
	public void testSub1() {
		assertEquals(3, calculator.sub(6,3));
	}
	
	@Test
	public void testMul() {
		assertEquals(6, calculator.mul(3,2));
	}
	@Test
	public void testDiv() {
		assertEquals(2, calculator.div(4,2));
	}
}

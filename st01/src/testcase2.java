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

}

package ch.bbw.bolliger;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSummeZweiPositive() {
		Calculator calculator = new Calculator();
		int result = calculator.addition(2, 3);
		assertEquals(5, result);
	}
	
	@Test
	public void testSummeZweiNegative(){
		Calculator calculator = new Calculator();
		int result = calculator.addition(-2, -3);
		assertEquals(-5, result);
	}
	
	@Test
	public void testSummeZweiNull(){
		Calculator calculator = new Calculator();
		int result = calculator.addition(0, 0);
		assertEquals(0, result);
	}

}

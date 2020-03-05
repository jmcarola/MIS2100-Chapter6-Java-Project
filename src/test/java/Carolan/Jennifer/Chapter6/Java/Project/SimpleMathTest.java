package Carolan.Jennifer.Chapter6.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {
	
	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath mathObject = new SimpleMath ();
		assertEquals(0, mathObject.divide(0,7),0.01);
	}
		
	@Test 
	public void testThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath mathObject1 = new SimpleMath ();
		assertEquals(0.25, mathObject1.divide(1,4),0.01);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testThatZeroDenominatorThrowsException() {
		SimpleMath mathObject2 = new SimpleMath ();
		mathObject2.divide(6,0);
	}
}
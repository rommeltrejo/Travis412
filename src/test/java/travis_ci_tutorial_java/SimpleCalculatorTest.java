package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}

	@Test
	public void testMinus(){
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(calculator.minus(20,2),18);
	}

	@Test
	public void testMultiply(){
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(calculator.multiply(12,2), 24);
	}

	@Test
	public void testDivide(){
		SimpleCalculator calc  = new SimpleCalculator();
		assertEquals(calc.divide(10,2),5);
	}
}

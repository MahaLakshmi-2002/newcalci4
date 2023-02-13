package calcitest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import calci4.Calci4;

public class CalciTest {
	
	public static Calci4 objCalculator;

	@Before
	public void setup() throws Exception {
		
		objCalculator=new Calci4();
		
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("closing ");
	}

	@Test
	public void additionTest() {
		
		assertEquals(25, objCalculator.addition(12, 13));
		
	}
	
	@Test
	public void substractTest() {
		assertEquals(-1,objCalculator.subtract(12, 13));
		
	}
	
	@Test
	public void divisionTest() {
		assertEquals(0,objCalculator.division(12, 13));
		
	}
	
	
	@Test
	public void MutlitplicationTest() {
		assertEquals(156,objCalculator.multiplication(12, 13));
		
	}
	
	

}

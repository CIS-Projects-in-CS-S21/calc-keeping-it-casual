package edu.temple.cis3296;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalculatorModelTest {
	CalculatorModel calc; 

	@Before 
	public void initialize(){
		calc = new CalculatorModel();
	}

	@Test
	public void shouldAddTwoPlusTwo(){
		// Assert 2.0 plus 2.0 is equals 4.0 plus or minus 0.1 epsilon
		// Double comparaison necessite to specify an epsilon. 
		assertEquals(4.0, calc.operationAdd(2.0, 2.0), 0.1);
	} 

	@Test
	public void shouldSubstTwoAndTwo(){
		assertEquals(0.0, calc.operationSubst(2.0, 2.0), 0.1);
	} 

	@Test
	public void shouldMultTwoByOne(){
		assertEquals(2.0, calc.operationMult(2.0, 1.0), 0.1);
	}
	
	// this tests for a mutliplcation that is not the identity
	@Test
        public void shouldMultTwoBy4(){
                assertEquals(8.0, calc.operationMult(2.0, 4.0), 0.1);
        } 

	@Test
	public void shouldDivTwoByOne(){
		assertEquals(2.0, calc.operationDiv(2.0, 1.0), 0.1);
	}

	/*
	 * Test created the demonstrates that calculator subtraction is working.
	 */
	@Test
	public void shouldSubtractFiveAndTwo(){
		assertEquals(3.0, calc.operationSubst(5.0, 2.0), 0.1);
	}

	/*
	 * Test created the demonstrates that calculator subtraction is working.
	 */
	@Test
	public void shouldSubtractTenAndTwo(){
		assertEquals(8.0, calc.operationSubst(10.0, 2.0), 0.1);
	}

	/*
		Test that demonstrates that division is working when RHS < LHS
	 */
	@Test
	public void shouldDivFiveByTen(){
		assertEquals(0.5, calc.operationDiv(5.0, 10.0), 0.1);
	}

	/*
		Test that demonstrates that division is working when RHS > LHS
	 */

	@Test
	public void shouldDivTenByFive(){
		assertEquals(2.0, calc.operationDiv(10.0, 5.0), 0.1);
	}


}

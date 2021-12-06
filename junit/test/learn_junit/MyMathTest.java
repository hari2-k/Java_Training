package learn_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath myMath = new MyMath();
	@Test
	public void sum_with3numbers() {
		assertEquals(6,myMath.sum(new int[] {1,2,3}));
	}
	
	@Test
	public void sum_with2numbers() {
		assertEquals(5,myMath.sum(new int[] {2,3}));
	}

}

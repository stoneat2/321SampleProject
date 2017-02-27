import static org.junit.Assert.*;
import org.junit.Test;

//Authors: Andrew Stone, Richard Bodziak

public class CalcTest {

	final int A = 10;
	final int B = 2;

	// tests the subtract method. To pass, I needed to write the method and
	// return a-b. No refactoring was necessary.
	@Test
	public void testSubtract() {
		assertEquals(Calc.subtract(A, B), 8);
	}

	// tests the multiply method. To pass, I needed to write the method and
	// return a*b. No refactoring was necessary.
	@Test
	public void testMultiply() {
		assertEquals(Calc.multiply(A, B), 20);
	}

	// tests the divide method. To pass, I needed to write the method and return
	// the correct the result. I decided that the method should return an
	// integer. No refactoring was necessary.
	@Test
	public void testDivide() {
		assertEquals(Calc.divide(A, B), 5);
	}
}

import junit.framework.TestCase;

public class TestOperaciones extends TestCase{
	Operaciones opera;
	
	public TestOperaciones() {
		opera = new Operaciones();
	}

	public void testSumar() {
		assertEquals(10, opera.sumar(5, 5));
	}
	public void testRestar() {
		assertEquals(2, opera.restar(5, 3));
	}
	public void testMult() {
		assertEquals(15, opera.multiplicar(5, 3));
	}
	public void testDividir() {
		assertEquals(0.0, opera.dividir(10, 0));
	}
}

package triangulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TrianguloTest {

	@Test
	void testEquilatero() {
		Triangulo triangulo = new Triangulo (3,3,3);
		assertEquals(triangulo.toString(), "El Triangulo es Equilatero");
	}
	
	
	@Test
	void testIsosceles1() {
		Triangulo triangulo = new Triangulo (2,3,3);
		assertEquals(triangulo.toString(), "El Triangulo es Isosceles");
	}
	
	@Test
	void testIsosceles2() {
		Triangulo triangulo = new Triangulo (3,2,3);
		assertEquals(triangulo.toString(), "El Triangulo es Isosceles");
	}

	@Test
	void testIsosceles3() {
		Triangulo triangulo = new Triangulo (3,3,2);
		assertEquals(triangulo.toString(), "El Triangulo es Isosceles");
	}
	
	@Test
	void testEscaleno() {
		Triangulo triangulo = new Triangulo (3,2,1);
		assertEquals(triangulo.toString(), "El Triangulo es Escaleno");
	}
}

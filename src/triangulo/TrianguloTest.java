package triangulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TrianguloTest {

	
	@Test
	void test1() {
		Triangulo triangulo = new Triangulo (3,2,3);
		assertEquals(triangulo.toString(), "El Triangulo es Isosceles");
	}

	@Test
	void test2() {
		Triangulo triangulo = new Triangulo (5,5,5);
		assertEquals(triangulo.toString(), "El Triangulo es Equilatero");
	}
	
	@Test
	void test3() {
		Triangulo triangulo = new Triangulo (3,5,4);
		assertEquals(triangulo.toString(), "El Triangulo es Escaleno");
	}
	
	@Test
	void test4() {
		Triangulo triangulo = new Triangulo (1,2,5);
		assertEquals(triangulo.toString(),"El Triangulo es Invalido_No_Se_Puede_Formar");
	}
	
	@Test
	void test5() {
		Triangulo triangulo = new Triangulo (-3,5,4);
		assertEquals(triangulo.toString(),"El Triangulo es Invalido_Lado_Negativo_O_Cero");
	}
	

	
	@Test
	void test6() {
		Triangulo triangulo = new Triangulo (0,5,4);
		assertEquals(triangulo.toString(),"El Triangulo es Invalido_Lado_Negativo_O_Cero");
	}
	
	@Test
	void test7() {
		Triangulo triangulo = new Triangulo (3,3,2);
		assertEquals(triangulo.toString(),"El Triangulo es Isosceles");
	}
	
	@Test
	void test8() {
		Triangulo triangulo = new Triangulo (2,3,3);
		assertEquals(triangulo.toString(),"El Triangulo es Isosceles");
	}
	
	@Test
	void test9() {
		Triangulo triangulo = new Triangulo (3,3,6);
		assertEquals(triangulo.toString(),"El Triangulo es Isosceles");
	}
	
	@Test
	void test10() {
		Triangulo triangulo = new Triangulo (6,3,3);
		assertEquals(triangulo.toString(),"El Triangulo es Isosceles");
	}
	
	@Test
	void test11() {
		Triangulo triangulo = new Triangulo (3,6,3);
		assertEquals(triangulo.toString(),"El Triangulo es Isosceles");
	}
	
	@Test
	void test12() {
		Triangulo triangulo = new Triangulo (2,1,5);
		assertEquals(triangulo.toString(),"El Triangulo es Invalido_No_Se_Puede_Formar");
	}
	
	@Test
	void test13() {
		Triangulo triangulo = new Triangulo (5,2,1);
		assertEquals(triangulo.toString(),"El Triangulo es Invalido_No_Se_Puede_Formar");
	}
	
	@Test
	void test14() {
		Triangulo triangulo = new Triangulo (0,0,0);
		assertEquals(triangulo.toString(),"El Triangulo es Invalido_Lado_Negativo_O_Cero");
	}
	/*
	@Test
	void test15() {
		Triangulo triangulo = new Triangulo (2.5,2.5,2.5);
		assertEquals(triangulo.toString(),"El Triangulo es Invalido_TresLadosNoSonEnteros");
	}
	
	@Test
	void test16() {
		Triangulo triangulo = new Triangulo (2.5,3,3);
		assertEquals(triangulo.toString(),"El Triangulo es Invalido_UnLadoNoEsEntero");
	}
	
	@Test
	void test17() {
		Triangulo triangulo = new Triangulo (3,2.5,3);
		assertEquals(triangulo.toString(),"El Triangulo es Invalido_UnLadoNoEsEntero");
	}
	
	@Test
	void test18() {
		Triangulo triangulo = new Triangulo (3,3,2.5);
		assertEquals(triangulo.toString(),"El Triangulo es Invalido_UnLadoNoEsEntero");
	}
	
	@Test
	void test19() {
		Triangulo triangulo = new Triangulo (2.5,2.5,3);
		assertEquals(triangulo.toString(),"El Triangulo es Invalido_DosLadosNoSonEnteros");
	}
	
	@Test
	void test20() {
		Triangulo triangulo = new Triangulo (2.5,3,2.5);
		assertEquals(triangulo.toString(),"El Triangulo es Invalido_DosLadosNoSonEnteros");
	}
	
	@Test
	void test21() {
		Triangulo triangulo = new Triangulo (3,2.5,2.5);
		assertEquals(triangulo.toString(),"El Triangulo es Invalido_DosLadosNoSonEnteros");
	}
	*/
}

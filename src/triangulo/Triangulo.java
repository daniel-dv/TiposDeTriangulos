package triangulo;

public class Triangulo {

	private enum TipoTriangulo {
		Equilatero, Isosceles, Escaleno, Invalido_Lado_Negativo_O_Cero, Invalido_No_Se_Puede_Formar;
	}

	private TipoTriangulo tipoTriangulo;

	public Triangulo(int lado1, int lado2, int lado3) {
		if (es_invalido(lado1,lado2,lado3)) {
			this.tipoTriangulo = TipoTriangulo.Invalido_Lado_Negativo_O_Cero;
		} else if (no_puede_formarse(lado1,lado2,lado3)) {
			this.tipoTriangulo = TipoTriangulo.Invalido_No_Se_Puede_Formar;
		} else if (es_equilatero(lado1,lado2,lado3)) {
			this.tipoTriangulo = TipoTriangulo.Equilatero;
		} else if (es_isosceles(lado1,lado2,lado3)) {
				this.tipoTriangulo = TipoTriangulo.Isosceles;
		} else
				this.tipoTriangulo = TipoTriangulo.Escaleno;
	}
	
	private boolean es_invalido(int lado1, int lado2, int lado3) {
		if(lado1 <= 0 || lado2 <= 0 || lado3 <= 0)
			return true;
		return false;
	}
	
	private boolean no_puede_formarse(int lado1, int lado2, int lado3) {
		if((lado1 + lado2 < lado3) || (lado1 + lado3 < lado2) || (lado2 + lado3 < lado1)) 
			return true;
		return false;
	}
	
	private boolean es_equilatero(int lado1, int lado2, int lado3) {
		if(lado1 == lado2 && lado2 == lado3)
			return true;
		return false;
	}
	
	private boolean es_isosceles(int lado1, int lado2, int lado3) {
		if(lado1 == lado3 || lado1 == lado2 || lado2 == lado3)
			return true;
		return false;
	}
	
	public String toString() {
		return "El Triangulo es " + this.tipoTriangulo;
	}
	
}
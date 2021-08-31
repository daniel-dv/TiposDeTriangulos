package triangulo;

public class Triangulo {
	
	private enum TipoTriangulo{
		Equilatero, Isosceles, Escaleno;
	}
	
	private TipoTriangulo tipoTriangulo;

	public Triangulo(double lado1, double lado2, double lado3) {
		if (lado1 == lado2 && lado2 == lado3) {
			this.tipoTriangulo = TipoTriangulo.Equilatero;
		} else {
			if (lado1 == lado3 || lado1 == lado2 || lado2 == lado3)
				this.tipoTriangulo = TipoTriangulo.Isosceles;
			else
				this.tipoTriangulo = TipoTriangulo.Escaleno;
		}
	}



	public String toString() {
		return "El Triangulo es " + this.tipoTriangulo;
	}
}
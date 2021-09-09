package triangulo;

public class Triangulo {
	
	private enum TipoTriangulo{
		Equilatero, Isosceles, Escaleno, Invalido_Lado_Negativo_O_Cero, Invalido_No_Se_Puede_Formar, Invalido_UnLadoNoEsEntero, Invalido_DosLadosNoSonEnteros, Invalido_TresLadosNoSonEnteros;
	}
	
	private TipoTriangulo tipoTriangulo;

	public Triangulo(int lado1, int lado2, int lado3) {
		if( lado1<=0 || lado2<=0 || lado3<=0) {
			this.tipoTriangulo = TipoTriangulo.Invalido_Lado_Negativo_O_Cero;
		}
		else if((lado1+lado2 < lado3) || (lado1+lado3 < lado2) || (lado2+lado3 < lado1)) {
			this.tipoTriangulo = TipoTriangulo.Invalido_No_Se_Puede_Formar;
		}
		else if (lado1 == lado2 && lado2 == lado3) {
			this.tipoTriangulo = TipoTriangulo.Equilatero;
		} else {
			if (lado1 == lado3 || lado1 == lado2 || lado2 == lado3)
				this.tipoTriangulo = TipoTriangulo.Isosceles;
			else
				this.tipoTriangulo = TipoTriangulo.Escaleno;
		}
	}
	
	public Triangulo (double lado1, double lado2, double lado3) {
		int cantLados =0;
		if (Math.floor(lado1) != lado1) {
			cantLados++;
		}
		if (Math.floor(lado2) != lado2) {
			cantLados++;
		}
		if (Math.floor(lado3) != lado3) {
			cantLados++;
		}
		
		
		if (cantLados == 1) 
			this.tipoTriangulo = TipoTriangulo.Invalido_UnLadoNoEsEntero;
		else if (cantLados == 2)
			this.tipoTriangulo = TipoTriangulo.Invalido_DosLadosNoSonEnteros;
		else if (cantLados == 3)
			this.tipoTriangulo = TipoTriangulo.Invalido_TresLadosNoSonEnteros;
	}

	public String toString() {
		return "El Triangulo es " + this.tipoTriangulo;
	}
}
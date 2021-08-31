package triangulo;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		try (Scanner lecturaPorTeclado = new Scanner(System.in)) {
			List<Double> lados = new LinkedList<Double>();
			for (int i = 0; i < 3; i++) {
				System.out.println("Ingrese lado " + (i + 1) + ": ");
				lados.add(lecturaPorTeclado.nextDouble());
			}
			Triangulo triangulo1 = new Triangulo(lados.get(0), lados.get(1), lados.get(2));

			System.out.println(triangulo1);
		}
	}
}

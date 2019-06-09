package calculadora;

import util.Leer;

public class Calculator {

	public static void main(String[] args) {
		int opt;
		int a;
		int b;
		double result;

		System.out.println("Bienvenido a calculator");

		do {

			System.out.println("[1] Sumar [2] Restar [3] Multiplicar [4] Dividir [5] Información ");
			opt = Leer.datoInt();

		} while (opt != 0);

	}

}

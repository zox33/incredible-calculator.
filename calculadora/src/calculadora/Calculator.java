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

			switch (opt) {
			case 1:
				System.out.println("Inserte numero a");
				a = Leer.datoInt();
				System.out.println("Inserte numero b");
				b = Leer.datoInt();
				result = a + b;
				System.out.println("El resultado es "+result);

				break;
			case 2:
				System.out.println("Inserte numero a");
				a = Leer.datoInt();
				System.out.println("Inserte numero b");
				b = Leer.datoInt();
				result = a - b;
				System.out.println("El resultado es "+result);

				break;
			case 3:

				break;
			case 4:


			case 5:
				System.out.println("En esta calculadora deberás elegir una opción tras eso, deberas elegir dos numero, siendo a"
						+ "el primer numero de la operación");
				break;

			default:
				System.out.println("Esa opción no existe");
				break;
			}

		} while (opt != 0);

	}

}

package debugueando;

public class Ejercicio {

	double nota1 = 4;
	double nota2 = 4;
	int numeros[];

	Ejercicio() {
		System.out.println("entr�");
		promedio();
		numeros();
	}

	public void numeros() {

		numeros = new int[6];
		int n = numeros.length;

		for (int i = 0; i < n; i++) {
			numeros[i] = i;
		}

		for (int numero : numeros) {
			System.out.println(numero);
		}

	}

	public void promedio() {
		double resultado = (nota1 + nota2) / 2;
		System.out.println(resultado);
	}
}
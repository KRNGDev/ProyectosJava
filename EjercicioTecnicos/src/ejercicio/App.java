package ejercicio;

public class App {

	// Das una cadena de string y te la devuelve volteada.
	private void miInvertString(String text) {
		String[] cadena = text.split("");
		StringBuilder newText = new StringBuilder();

		for (int i = cadena.length; i > 0; i--) {
			newText.append(cadena[i - 1]);
		}
		System.out.println(newText);

	}

	// Otra forma es esta
	public static String invertir(String cadena) {
		StringBuilder invertida = new StringBuilder(cadena);
		return invertida.reverse().toString();
	}

	// Busca en un array de enteros un numero entero objetivo y te devuelve la
	// posicion en el array de este
	public static int buscar(int[] array, int objetivo) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == objetivo) {
				return i;
			}
		}

		return -1;
	}

	// Detectar si es un Palindromo

	public void palindromo(String texto) {
		StringBuilder invertido = new StringBuilder(texto).reverse();

		if (texto.equals(invertido.toString())) {
			System.out.println("Es palindromo");

		} else {
			System.out.println("No es palindromo");
		}
	}

	//Colocacion de array 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app = new App();
		// primera cadena al reves
		app.miInvertString("hola");
		// Segunda cadena al reves
		System.out.println(invertir("Mi moto alpina derrapante"));

		// Devuelve la posicion de un numero en el array
		int[] array = { 5, 2, 8, 3, 8, 2, 4, };
		System.out.println(buscar(array, 8));

		// Determina si un acadena es un palindromo
		app.palindromo("oro");
		app.palindromo("pako");

		//

	}

}

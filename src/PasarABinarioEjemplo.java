
public class PasarABinarioEjemplo {
	public void pasarABinario(int numero) {
		if (numero / 2 >= 1) {
			// llamada recursiva
			pasarABinario(numero / 2);
		} else {
			// caso base no se hace nada luego el else se puede quitar
		}
		System.out.println(numero % 2);
	}

	public static void main(String[] args) {
		int num = 7;
		System.out.printf("::CONVERTIR DECIMAL A BINARIO::\n");
		System.out.printf("Introduce un numero: "); // Pedir variable num
		System.out.printf("\n");
		new PasarABinarioEjemplo().pasarABinario(num);
		System.out.printf("\n"); // Llamar la funcion

	}
}

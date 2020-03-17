
public class PasarABinarioEjemplo2 {
	public void pasarABinario(int numero,StringBuilder cadena) {
		if (numero / 2 >= 1) {
			// llamada recursiva
			pasarABinario(numero /2 ,cadena);
		} else {
			// caso base no se hace nada luego el else se puede quitar
		}
		cadena.append(numero % 2);
	}

	public static void main(String[] args) {
		int num = 4;
		System.out.printf("::CONVERTIR DECIMAL A BINARIO::\n");
		System.out.printf("Introduce un numero: "); // Pedir variable num
		System.out.printf("\n");
		StringBuilder cadena=new StringBuilder("");
		new PasarABinarioEjemplo2().pasarABinario(num,cadena);
		System.out.printf("\n"); // Llamar la funcion
		System.out.println("cadena "+cadena);
	}
}

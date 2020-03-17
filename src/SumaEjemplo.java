
public class SumaEjemplo {
	public static void main(String[] args) {
		int[] numeros={45,34,34,23,54,56,-1};
		System.out.println(new SumaEjemplo().sumaNumeros(numeros, numeros.length-1));
	}
	public long sumaNumeros(int[]numeros,int index){
		//caso base
		if(index==0)
			return numeros[index];
		//llamar recursiva diferente
		else
			return numeros[index]+sumaNumeros(numeros, index-1);
	}
}

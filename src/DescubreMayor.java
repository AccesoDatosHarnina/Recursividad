
public class DescubreMayor {
	public int[] numeros = { 115, 34, 434, 123, 23, 54, 56, 9991 };

	public int descubreMayor(int posicion) {
		// caso base
		if (posicion == 0) {
			return 0;
		} else {
			int actual = descubreMayor(posicion - 1);
			 if(numeros[posicion]<numeros[actual]){
				 return actual;
			 }else{
				 return posicion;
			 }
		}
	}
	public static void main(String[] args) {
		DescubreMayor busqueda=new DescubreMayor();
		 System.out.println(busqueda.numeros[busqueda.descubreMayor(busqueda.numeros.length-1)]);
	 }
}

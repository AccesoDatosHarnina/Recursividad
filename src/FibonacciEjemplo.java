
public class FibonacciEjemplo {
	public long fibonacci(long pos){
		long retornado=0;
		//caso base cuando estamos cualculando el termino 0 o 1
		if(pos==0||pos==1){
			retornado=pos;
		}
		else{
			retornado=fibonacci(pos-2)+fibonacci(pos-1);
		}
		return retornado;
	}
	public static void main(String[] args) {
		System.out.println(new FibonacciEjemplo().fibonacci(5));
	}
}

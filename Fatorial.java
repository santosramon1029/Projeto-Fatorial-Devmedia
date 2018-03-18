public class Fatorial{
	public static void main(String[] args){ 
		long result = calcularFatorial(18);
		System.out.println(result);
	}

	public static long calcularFatorial(long num){
		if(num == 0)
		return 1;

		for(long i = (num -1) ; i > 0 ; i--){
			num *= i;
		}

		return num;
	}
}

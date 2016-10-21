package tads.java8.lambda;

import java.util.Arrays;

public class E2_OrdenacaoLambda {

	public static void main(String[] args) {
		Integer[] numeros = new Integer[] { 9, 6, 3, 0, 5, 10, 1, 8, 4, 2, 7 };
		System.out.println(Arrays.toString(numeros));

		Arrays.sort(numeros, (Integer n1, Integer n2) -> (n1 > n2) ? -1 : (n1 < n2) ? 1 : 0);
		
// 		SINTAXE ALTERNATIVA:		
//		Arrays.sort(numeros, (Integer n1, Integer n2) -> {
//			if (n1 > n2) return -1;
//			if (n1 < n2) return 1;
//			return 0;	
//		});
		
		
		System.out.println(Arrays.toString(numeros));
	}
}

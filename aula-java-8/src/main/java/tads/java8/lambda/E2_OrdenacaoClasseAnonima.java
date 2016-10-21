package tads.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class E2_OrdenacaoClasseAnonima {

	public static void main(String[] args) {
		Integer[] numeros = new Integer[] { 9, 6, 3, 0, 5, 10, 1, 8, 4, 2, 7 };
		System.out.println(Arrays.toString(numeros));

		Arrays.sort(numeros, new Comparator<Integer>() {
			@Override
			public int compare(Integer n1, Integer n2) {
				if (n1 > n2)
					return -1;
				if (n1 < n2)
					return 1;
				return 0;
			}
		});
		
		System.out.println(Arrays.toString(numeros));
	}
}

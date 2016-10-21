package tads.java8.lambda;

public class E3_CalculadoraDouble {
	
	static E3_OperadorDouble soma = (n1, n2) -> n1 + n2;
	static E3_OperadorDouble subtracao = (n1, n2) -> n1 - n2;
	static E3_OperadorDouble multiplicacao = (n1, n2) -> n1 * n2;
	static E3_OperadorDouble divisao = (n1, n2) -> n1 / n2;
	static E3_OperadorDouble resto = (n1, n2) -> n1 % n2;
	
	public static void main(String[] args) {
		System.out.println("Resultado da soma: " + soma.aplicar(1, 2));
		System.out.println("Resultado da subtracao: " + subtracao.aplicar(1, 2));
		System.out.println("Resultado da multiplicacao: " + multiplicacao.aplicar(1, 2));
		System.out.println("Resultado da divisao: " + divisao.aplicar(1, 2));
		System.out.println("Resultado do resto: " + resto.aplicar(2, 2));
	}

}

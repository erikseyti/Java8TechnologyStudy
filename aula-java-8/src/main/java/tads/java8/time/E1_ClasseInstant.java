 package tads.java8.time;

import java.time.Duration;
import java.time.Instant;

public class E1_ClasseInstant {
	
	public static void main(String[] args) {
		//Pegando a data atual
		Instant agora = Instant.now();
		System.out.println(agora.toString()); //formato ISO-8601
		
		
		//Calculando o tempo de execução de um algoritmo
		Instant inicio = Instant.now();
		rodaAlgoritmo();
		Instant fim = Instant.now();
		Duration duracao = Duration.between(inicio, fim);
		//a duração pode ser obtida em diferentes medidas: toNanos, toMillis, getSeconds, etc 
		
		//long duracaoEmMilissegundos = duracao.toMillis();
		long duracaoEmMilissegundos = duracao.getSeconds();
		System.out.println("Tempo de execução: " + duracaoEmMilissegundos + " seg");
	}

	private static void rodaAlgoritmo() {
		String resultado = new String();
		for (int i = 0; i < 30000; i++) {
			resultado += i;
		}
	}

}

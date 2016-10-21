package tads.java8.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class E8_TempoEntreDatas {

	public static void main(String[] args) {
		LocalDate aniversarioPvai = LocalDate.of(1952, Month.DECEMBER, 14);
		LocalDate hoje = LocalDate.now();
		
		long anos = ChronoUnit.YEARS.between(aniversarioPvai, hoje);
		System.out.println("Idade Pvai: " + anos);
	}

}

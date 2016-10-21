package tads.java8.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class E7_ManipulandoDatas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDate amanha = hoje.plusDays(1);
		System.out.println("Amanhã será: " + amanha);
		
		TemporalAdjuster ajustadorParaProximaSexta = TemporalAdjusters.next(DayOfWeek.FRIDAY);
		LocalDate proximaSexta = LocalDate.now().with(ajustadorParaProximaSexta); //ajusta a data para a próxima sexta-feira
		System.out.println("A próxima sexta-feira será: " + proximaSexta);
	}

}

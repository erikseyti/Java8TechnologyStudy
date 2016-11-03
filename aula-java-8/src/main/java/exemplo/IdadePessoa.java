package exemplo;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class IdadePessoa {

	public static void main(String[] args) {
		LocalDate poeta7Faces = LocalDate.of(1902, Month.OCTOBER, 31);
		LocalDate hoje = LocalDate.now();
		
		long idadeCarlos = ChronoUnit.YEARS.between(poeta7Faces, hoje);
		long diasPoesia = ChronoUnit.DAYS.between(poeta7Faces, hoje);
		System.out.println("Idade de Carlos Drummond de Andrade: "+idadeCarlos);
		System.out.println("Segundos de Existtencia do Poeta Carlos Drummond de Andrade: "+ diasPoesia);

		
	}

}

package tads.java8.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class E6_ComparandoDatas {

	public static void main(String[] args) {
		LocalDate anoNovo = LocalDate.of(2014, 1, 1);
		LocalDate natal = LocalDate.of(2014, 12, 25);

		System.out.println(anoNovo.isBefore(natal));
		System.out.println(anoNovo.isAfter(natal));
		System.out.println(anoNovo.isEqual(natal));

		LocalTime almoco = LocalTime.of(12, 0);
		LocalTime jantar = LocalTime.of(20, 30);

		System.out.println(almoco.isBefore(jantar));
		System.out.println(almoco.isAfter(jantar));
		System.out.println(almoco.equals(jantar));

		LocalDateTime anoNovoAlmoco = LocalDateTime.of(anoNovo, almoco);
		LocalDateTime natalJantar = LocalDateTime.of(natal, jantar);

		System.out.println(anoNovoAlmoco.isBefore(natalJantar));
		System.out.println(anoNovoAlmoco.isAfter(natalJantar));
		System.out.println(anoNovoAlmoco.isEqual(natalJantar));
	}

}

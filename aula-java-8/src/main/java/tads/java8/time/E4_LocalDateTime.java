package tads.java8.time;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class E4_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime aberturaDaCopa = LocalDateTime.of(2014, Month.JUNE, 12, 17, 0);
		System.out.println(aberturaDaCopa.getDayOfWeek().getDisplayName(TextStyle.FULL,new Locale("pt")));
	}

}

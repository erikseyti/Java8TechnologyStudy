package tads.java8.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class E5_FormatandoDatas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatador));

		LocalDateTime agora = LocalDateTime.now();
		formatador = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
									  .withLocale(new Locale("pt", "br")).withZone(ZoneId.of("America/Sao_Paulo"));
		System.out.println(agora.format(formatador));
	}
}

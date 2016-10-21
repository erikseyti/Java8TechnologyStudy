package tads.java8.time;

import java.time.LocalDateTime;
import java.time.Month;

public class E4_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime aberturaDaCopa = LocalDateTime.of(2014, Month.JUNE, 12, 17, 0);
		System.out.println(aberturaDaCopa);
	}

}

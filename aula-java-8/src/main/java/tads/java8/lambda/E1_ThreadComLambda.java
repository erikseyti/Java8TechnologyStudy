package tads.java8.lambda;

public class E1_ThreadComLambda {

	public static void main(String[] args) {
		new Thread(() -> System.out.println("thread com lambda!")).start();
	}
}

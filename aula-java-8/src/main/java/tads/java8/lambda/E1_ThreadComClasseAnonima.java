package tads.java8.lambda;

public class E1_ThreadComClasseAnonima {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread com classe anonima!");
			}
		};
		new Thread(r).start();
	}

}

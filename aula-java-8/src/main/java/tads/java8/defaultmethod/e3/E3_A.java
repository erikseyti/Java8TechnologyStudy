package tads.java8.defaultmethod.e3;

public interface E3_A {
	
	default void foo() {
		System.out.println("Chamando A.foo()");
	}
	
	default void teste(int a)
	{
		System.out.println(a);
	}
	


}

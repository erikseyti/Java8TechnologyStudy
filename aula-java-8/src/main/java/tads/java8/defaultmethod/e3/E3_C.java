package tads.java8.defaultmethod.e3;

public class E3_C implements E3_A, E3_B {
	@Override
	public void foo() {
		E3_A.super.foo();
	}
}

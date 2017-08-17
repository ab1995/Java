package corejava.java8.airthmetic;

@FunctionalInterface
public interface MathematicalOperation<T> {
	T operate(T a, T b);
}

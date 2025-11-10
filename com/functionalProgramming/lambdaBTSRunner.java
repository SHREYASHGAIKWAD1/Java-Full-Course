package com.functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class EvenNumberPredicate implements Predicate<Integer> {
	@Override
	public boolean test(Integer number) {
		return number%2 == 0;
	}
}

class PrintingTheConsumerOutput implements Consumer<Integer> {

	@Override
	public void accept(Integer numbers) {
		System.out.println(numbers);
	}
}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		return number * number;
	}
	
}

public class lambdaBTSRunner {

	public static void main(String[] args) {
		List.of(23,43,56,24,78,43,77,96).stream().filter(n -> n%2 == 0).map(e -> e*e).forEach(e -> System.out.println(e));
		System.out.print("\n");
		
		//filter(n -> n%2 == 0)
	    //Stream<T> filter(Predicate<? super T> predicate);
		//boolean test(T t);
		List.of(23,43,56,24,78,43,77,96).stream().filter(new EvenNumberPredicate()).map(e -> e*e).forEach(new PrintingTheConsumerOutput());
		
		System.out.print("\n");
		//forEach(e -> System.out.println(e))
		//void forEach(Consumer<? super T> action)
		//void accept(T t)
		List.of(23,43,56,24,78,43,77,96).stream().filter(new EvenNumberPredicate()).map(e -> e*e).forEach(e -> System.out.println(e));
		
		System.out.print("\n");
		//map(e -> e*e)
		//<R> Stream<R> map(Function<? super T, ? extends R> mapper)
		//R apply(T t)
		List.of(23,43,56,24,78,43,77,96).stream().filter(new EvenNumberPredicate()).map(new NumberSquareMapper()).forEach(e -> System.out.println(e));
	}

}

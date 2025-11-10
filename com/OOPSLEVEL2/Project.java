package com.OOPSLEVEL2;

public class Project {
	
	interface Test {
		void nothing1();
		default void nothing2() {
		}
		default void nothing3() {
		}
	}
	
	class Class1 implements Test{
		@Override
		public void nothing1() {
		}
	}
	
	class Class2 implements Test {
		@Override
		public void nothing1() {
		}
	}
	
	public static void main(String[] args) {
		ComplexAlgorithm algo = new RealAlgorithm();
		System.out.println(algo.complexAlgorithm(20, 80));
	}
}

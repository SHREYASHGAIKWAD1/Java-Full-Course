package com.Javatips;

class DefaultClass {
	
}

public class NestedClassRunner {

	int i;
	static int j = 0;
	class InnerClass {
		public void method() {
			i = 5;
		}
	}
	
	static class StaticNestedClass {
		public void method() {
			//i = 5;
			j = 0;
		}
	}
	
	public static void main(String[] args) {
		//InnerClass innerClass = new InnerClass();
		StaticNestedClass staticNestedClass = new StaticNestedClass();
		
		NestedClassRunner nestedClassRunner = new NestedClassRunner();
		InnerClass innerClass = nestedClassRunner.new InnerClass();
	}
}

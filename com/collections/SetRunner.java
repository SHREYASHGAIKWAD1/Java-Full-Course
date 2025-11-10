package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		 List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		 
		 Set<Character> treeSet = new TreeSet<>(characters);
		 System.out.println("Tree Set - " + treeSet);
		 
		 Set<Character> linkedSet = new LinkedHashSet<>(characters);
		 System.out.println("Linked Set - " + linkedSet);
		 
		 Set<Character> hashSet = new HashSet<>(characters);
		 System.out.println("Hash Set - " + hashSet);
	}
}

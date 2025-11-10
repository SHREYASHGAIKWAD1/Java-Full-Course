package com.Javatips;

import java.math.BigDecimal;
import java.util.ArrayList;
//import java.util.Collections;

import static java.lang.System.out;
import static java.util.Collections.*;

public class ImportsRunner {

	public static void main(String[] args) {
		String str = "";
		//No need to import String class because it comes under java.lang.
		
		BigDecimal bd = null;
		//Have to import BigDecimal because java.lang does not include it and comes under java.Math.
		
		System.out.println("Imports");
		out.println("static import");
		
		/*collection.*/sort(new ArrayList<String>());
	}

}

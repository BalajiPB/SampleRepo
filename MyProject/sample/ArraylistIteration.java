package sample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistIteration {

	public static void main(String[] args) {
		
		ArrayList<String> arraysample = new ArrayList<String>();
		arraysample.add("oneSeries");
		arraysample.add("twoSeries");
		arraysample.add("threeSeries");
		arraysample.add("fourSeries");
		arraysample.add("fiveSeries");
		
		//1. for each loop and lamda expression
		System.out.println("for each loop and lamda expression");
		arraysample.forEach(show -> {
			System.out.println(show);
		});
	
		//2 while loop
		System.out.println("while loop");
		Iterator<String> it = arraysample.iterator();
		
		while(it.hasNext()) {
			String prnt = it.next();
			System.out.println(prnt);
		}
	
		// 3. using iterator and java 8 forEachRemaining() method
		it = arraysample.iterator();
		
		it.forEachRemaining(show -> {
			System.out.println(show);
		});
		
		// 4. for each loop
		System.out.println("-----for each loop--");
		for (String show : arraysample) {
			if (show == "threeSeries") {
			System.out.println(show);
		}
	
	}
}}

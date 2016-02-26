package edu.neumont.csc150.Final.butze;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
//		Table table = new Table();
//		SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                table.GUI();
//            }
//        });
		ArrayList<HashMap> headphones = new ArrayList<HashMap>();
		HashSet<String> set = new HashSet<String>();
		HashMap<String, String> practice = new HashMap<String, String>();
		HashMap<String, String> practice2 = new HashMap<String, String>();

		practice.put("Company", "Sony");
		practice.put("Price", "$100");
		practice2.put("Origin", "Japan");
		practice2.put("Price", "$800");
		headphones.add(practice);
		headphones.add(practice2);
		set.addAll(practice);
		set.addAll(practice2);
		//looping through all keys in practice
		for (String key : set.toArray(new String[0])) {
			System.out.println(key);
			//looping through arraylist 
			for (int i = 0; i < headphones.size(); i++) {
//				System.out.println(headphones.get(i).containsKey());
				System.out.println(headphones.get(i).get(key));
//				if (headphones.get(i).values().equals(null)) {
//					System.out.print("-");
//				}
			}
		}
//		for (String key2 : practice2.keySet()) {
//			System.out.print(key2);			
//		}
		
	}
}
	



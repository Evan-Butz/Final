package edu.neumont.csc150.Final.butze;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		HeadphoneSets s = new HeadphoneSets();
		s.keyUnion();
//		Table table = new Table();
//		SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                table.GUI();
//            }
//        });
//		ArrayList<HashMap> headphones = new ArrayList<HashMap>();
//		HashSet<Map<String, String>> set = new HashSet<Map<String, String>>();
//		Map<String, String> practice = new HashMap<String, String>();
//		Map<String, String> practice2 = new HashMap<String, String>();
//
//		practice.put("Company", "Sony");
//		practice.put("Price", "$100");
//		practice2.put("Origin", "Japan");
//		practice2.put("Price", "$800");
//		headphones.add((HashMap) practice);
//		headphones.add((HashMap) practice2);
//		set.add(practice);
//		set.add(practice2);
//		//looping through all keys in practice
//		ArrayList<String> alreadyUsed = new ArrayList<String>();
//		
//		for (Map<String, String> curMap : set) {
//			for (String key : curMap.keySet()) {
//				if (!alreadyUsed.contains(key)) {
//					System.out.println(key);
//					alreadyUsed.add(key);
//					// looping through arraylist
//
//					for (int i = 0; i < headphones.size(); i++) {
//						// System.out.println(headphones.get(i).containsKey());
//						System.out.println(headphones.get(i).get(key));
//						// if (headphones.get(i).values().equals(null)) {
//						// System.out.print("-");
//						// }
//					}
//				}
//			}
//		}
//		for (String key2 : practice2.keySet()) {
//			System.out.print(key2);			
//		}
		
	}
}
	



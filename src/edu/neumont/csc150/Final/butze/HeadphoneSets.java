package edu.neumont.csc150.Final.butze;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;

public class HeadphoneSets {
	private HashSet<HashMap<String, String>> headphoneSet;
	private Vector<String> keys = new Vector<String>();
	private Vector<String> attributes = new Vector<String>();

	public HeadphoneSets() {
		allSets();
		keyUnion();
	}

	public void allSets() {
		headphoneSet = new HashSet<HashMap<String, String>>();
		headphoneSet.add(Sony());
		headphoneSet.add(Sennheiser());
		headphoneSet.add(Grado());
		headphoneSet.add(Beyerdynamic());
		headphoneSet.add(VModa());
	}

	public void keyUnion() {
		allSets();
		for (HashMap<String, String> headphone : headphoneSet) {
			for (String key : headphone.keySet()) {
				if (!keys.contains(key)) {
					// System.out.println(key);
					keys.addElement(key);
					for (HashMap<String, String> h2 : headphoneSet) {
						// System.out.println(h2.get(key));
						attributes.addElement(h2.get(key));
					}
				}
			}
		}
		// for (String keys : keys) {
		// System.out.println(keys);
		//
		// }
		// for (String attributes : attributes) {
		// System.out.println(attributes);
		// }
	}

	public HashMap<String, String> Sony() {
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("Company", "Sony");
		h.put("Model", "MDR-Z7");
		h.put("Type", "Closed Back");
		h.put("Driver", "70mm");
		h.put("Frequency Response", "4 - 100,000");
		h.put("Sensativities", "102 dB/mW");
		h.put("Magnet", "Neodymium");
		h.put("Impedence", "70Ω");
		h.put("Weight", "11.82 oz (Without Cord)");
		h.put("Price", "$699.99");
		return h;
	}

	public HashMap<String, String> Sennheiser() {
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("Company", "Sennheiser");
		h.put("Model", "HD 800");
		h.put("Type", "Open Back");
		h.put("Driver", "56mm");
		h.put("Frequency Response", "6 - 51,000");
		h.put("Sensativities", "10 dB/mW");
		h.put("Magnet", "Neodymium");
		h.put("Impedence", "300Ω");
		h.put("Weight", "11.64 oz (Without Cord)");
		h.put("Price", "$1499.95");
		return h;
	}

	public HashMap<String, String> Grado() {
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("Company", "Grado");
		h.put("Model", "PS1000E");
		h.put("Type", "Open Air");
		h.put("Driver", "50mm");
		h.put("Frequency Response", "5 - 50,000");
		h.put("Sensativities", "98 dB/mW");
		h.put("Magnet", "Neodymium");
		h.put("Impedence", "32Ω");
		h.put("Weight", "24.10 oz (Without Cord)");
		h.put("Price", "$1695.00");
		return h;
	}

	public HashMap<String, String> Beyerdynamic() {
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("Company", "Beyerdynamic");
		h.put("Model", "T1 Tesla");
		h.put("Type", "Semi-Open Back");
		h.put("Driver", "51mm");
		h.put("Frequency Response", "5 - 50,000");
		h.put("Sensativities", "102 dB/mW");
		h.put("Magnet", "Neodymium");
		h.put("Impedence", "600Ω");
		h.put("Weight", "15.52 oz (Without Cord)");
		h.put("Price", "$1099.00");
		return h;
	}

	public HashMap<String, String> VModa() {
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("Company", "V-Moda");
		h.put("Model", "M-100");
		h.put("Type", "Closed Back");
		h.put("Driver", "50mm");
		h.put("Frequency Response", "5 - 30,000");
		h.put("Sensativities", "103 dB/mW");
		h.put("Magnet", "Neodymium");
		h.put("Impedence", "32Ω");
		h.put("Weight", "9.88 oz (Without Cord)");
		h.put("Price", "$270.00 - $27,000.00");
		return h;
	}

	public Vector<String> getKeys() {
		return keys;
	}

	public Vector<String> getAttributes() {
		return attributes;
	}

}

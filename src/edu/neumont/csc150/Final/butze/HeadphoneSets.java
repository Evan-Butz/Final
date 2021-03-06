package edu.neumont.csc150.Final.butze;

import java.util.*;


public class HeadphoneSets {
	private HashSet<HashMap<String, String>> headphoneSet;
	private Vector<String> keys;
	private Vector<Vector<String>> allAttributes = new Vector<Vector<String>>();
	private Vector<String> sony;
	private Vector<String> sennheiser;
	private Vector<String> grado;
	private Vector<String> beyerdynamic;
	private Vector<String> vmoda;

	public HeadphoneSets() {
		keyUnion();
	}

	private void allSets() {
		headphoneSet = new HashSet<HashMap<String, String>>();
		headphoneSet.add(Sony());
		headphoneSet.add(Sennheiser());
		headphoneSet.add(Grado());
		headphoneSet.add(Beyerdynamic());
		headphoneSet.add(VModa());
	}

	private void keyUnion() {
		keys = new Vector<String>();
		allSets();
		for (HashMap<String, String> headphone : headphoneSet) {
			for (String key : headphone.keySet()) {
				if (!keys.contains(key)) {
					keys.addElement(key);
//					 System.out.println(key);
				}
			}
		}
	}

	private HashMap<String, String> Sony() {
		HashMap<String, String> h = new HashMap<String, String>();
		sony = new Vector<String>();
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
			for (String values : h.values()) {
				sony.addElement(values);
			}
		allAttributes.addElement(sony);

		return h;
	}

	private HashMap<String, String> Sennheiser() {
		HashMap<String, String> h = new HashMap<String, String>();
		sennheiser = new Vector<String>();
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
		for (String values : h.values()) {
			sennheiser.addElement(values);
		}
		allAttributes.addElement(sennheiser);

		return h;
	}

	private HashMap<String, String> Grado() {
		HashMap<String, String> h = new HashMap<String, String>();
		grado = new Vector<String>();
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
		for (String values : h.values()) {
			grado.addElement(values);
		}
		allAttributes.addElement(grado);

		return h;
	}

	private HashMap<String, String> Beyerdynamic() {
		HashMap<String, String> h = new HashMap<String, String>();
		beyerdynamic = new Vector<String>();
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
		for (String values : h.values()) {
			beyerdynamic.addElement(values);
		}
		allAttributes.addElement(beyerdynamic);

		return h;
	}

	private HashMap<String, String> VModa() {
		HashMap<String, String> h = new HashMap<String, String>();
		vmoda = new Vector<String>();
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
		for (String values : h.values()) {
			vmoda.addElement(values);
		}
		allAttributes.addElement(vmoda);

		return h;
	}

	public Vector<String> getKeys() {
		return keys;
	}

	public Vector<Vector<String>> getAllAttributes() {
		return allAttributes;
	}

}

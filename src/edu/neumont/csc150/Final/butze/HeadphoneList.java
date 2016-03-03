package edu.neumont.csc150.Final.butze;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HeadphoneList implements Map<String, String> {
	public ArrayList<Headphone> collection;
	public HeadphoneList(){
		collection = new ArrayList<Headphone>();
		collection.add(Sony());
		collection.add(Sennheiser());
		collection.add(Grado());
		collection.add(Beyerdynamic());
		collection.add(VModa());
	}
	public Headphone Sony(){
		Headphone h = new Headphone();
		h.build("Company", "Sony");
		h.build("Model", "MDR-Z7");
		h.build("Type", "Closed Back");
		h.build("Driver", "70mm");
		h.build("Frequency Response", "4 - 100,000");
		h.build("Sensativities", "102 dB/mW");
		h.build("Magnet", "Neodymium");
		h.build("Impedence", "70Ω");
		h.build("Weight", "11.82 oz (Without Cord)");
		h.build("Price", "$699.99");
		return h;
	}
	public Headphone Sennheiser(){
		Headphone h = new Headphone();
		h.build("Company", "Sennheiser");
		h.build("Model", "HD 800");
		h.build("Type", "Open Back");
		h.build("Driver", "56mm");
		h.build("Frequency Response", "6 - 51,000");
		h.build("Sensativities", "10 dB/mW");
		h.build("Magnet", "Neodymium");
		h.build("Impedence", "300Ω");
		h.build("Weight", "11.64 oz (Without Cord)");
		h.build("Price", "$1499.95");
		return h;
	}
	public Headphone Grado(){
		Headphone h = new Headphone();
		h.build("Company", "Grado");
		h.build("Model", "PS1000E");
		h.build("Type", "Open Air");
		h.build("Driver", "50mm");
		h.build("Frequency Response", "5 - 50,000");
		h.build("Sensativities", "98 dB/mW");
		h.build("Magnet", "Neodymium");
		h.build("Impedence", "32Ω");
		h.build("Weight", "24.10 oz (Without Cord)");
		h.build("Price", "$1695.00");
		return h;
	}
	public Headphone Beyerdynamic(){
		Headphone h = new Headphone();
		h.build("Company", "Beyerdynamic");
		h.build("Model", "T1 Tesla");
		h.build("Type", "Semi-Open Back");
		h.build("Driver", "51mm");
		h.build("Frequency Response", "5 - 50,000");
		h.build("Sensativities", "102 dB/mW");
		h.build("Magnet", "Neodymium");
		h.build("Impedence", "600Ω");
		h.build("Weight", "15.52 oz (Without Cord)");
		h.build("Price", "$1099.00");
		return h;
	}
	public Headphone VModa(){
		Headphone h = new Headphone();
		h.build("Company", "V-Moda");
		h.build("Model", "M-100");
		h.build("Type", "Closed Back");
		h.build("Driver", "50mm");
		h.build("Frequency Response", "5 - 30,000");
		h.build("Sensativities", "103 dB/mW");
		h.build("Magnet", "Neodymium");
		h.build("Impedence", "32Ω");
		h.build("Weight", "9.88 oz (Without Cord)");
		h.build("Price", "$270.00 - $27,000.00");
		return h;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Set<java.util.Map.Entry<String, String>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Set<String> keySet() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String put(String key, String value) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void putAll(Map<? extends String, ? extends String> m) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Collection<String> values() {
		// TODO Auto-generated method stub
		return null;
	}
}

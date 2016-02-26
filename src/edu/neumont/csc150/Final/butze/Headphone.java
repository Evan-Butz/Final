package edu.neumont.csc150.Final.butze;

import java.util.*;

public class Headphone {
	
	private HashMap<String, String> Sony = new HashMap<String, String>();
	private HashMap<String, String> Sennheiser = new HashMap<String, String>();
	private HashMap<String, String> Grado = new HashMap<String, String>();
	private HashMap<String, String> Beyerdynamic = new HashMap<String, String>();
	private HashMap<String, String> VModa = new HashMap<String, String>();

	public void sonyBuild(String key, String value){
		Sony.put(key, value);
	}
	public void sennheiserBuild(String key, String value){
		Sennheiser.put(key, value);
	}
	public void gradoBuild(String key, String value){
		Grado.put(key, value);
	}
	public void beyerBuild(String key, String value){
		Beyerdynamic.put(key, value);
	}
	public void vmodaBuild(String key, String value){
		VModa.put(key, value);
	}
}

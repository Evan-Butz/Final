package edu.neumont.csc150.Final.butze;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class HeadphoneSets {
	private HeadphoneList hl;
	private HashSet <Map<String, String>> headphoneSet;
	private ArrayList<String> alreadyUsed = new ArrayList<String>();
	
	public void allSets(){
		HeadphoneList hl = new HeadphoneList();
		headphoneSet = new HashSet <Map<String, String>>();
		headphoneSet.add(hl);
	}
	public void keyUnion(){
		allSets();
		for (Map<String, String> map : headphoneSet){
			for (String key : map.keySet()){
				if (!alreadyUsed.contains(key)){
					System.out.println(key);
					alreadyUsed.add(key);
					for (int i = 0; i < hl.collection.size(); i++ ){
						System.out.println(((Map<String,String>) hl.collection.get(i)).get(key));
					}
				}
			}
		}
	}
}

package edu.neumont.csc150.Final.butze;

import java.util.HashSet;

public class HeadphoneSets {
	HashSet <String> headphoneSet;
	
	public HeadphoneSets(){
		headphoneSet = new HashSet <String>();
		HeadphoneList hl = new HeadphoneList();
		headphoneSet.addAll(hl);
	}
}

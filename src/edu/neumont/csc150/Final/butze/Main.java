package edu.neumont.csc150.Final.butze;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
//		 HeadphoneSets s = new HeadphoneSets();
//		 s.keyUnion();
		Table table = new Table();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				table.GUI();
			}
		});
	}
}

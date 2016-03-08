package edu.neumont.csc150.Final.butze;

import javax.swing.*;

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

package edu.neumont.csc150.Final.butze;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		Table table = new Table();
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                table.GUI();
            }
        });
	}

}

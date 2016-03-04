package edu.neumont.csc150.Final.butze;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.table.TableModel;

public class Table extends JPanel {
	private boolean DEBUG = false;
	HeadphoneSets hs = new HeadphoneSets();

	public Table() {
		super(new GridLayout(1, 0));
//		hs.allSets();
//		hs.keyUnion();
			
		final JTable table1 = new JTable(hs.getKeys(), hs.getAttributes());
		table1.setPreferredScrollableViewportSize(new Dimension(1700, 150));
		table1.setFillsViewportHeight(true);

		if (DEBUG) {
			table1.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					printDebugData(table1);
				}
			});
		}

		// Create the scroll pane and add the table to it.
		JScrollPane scrollPane = new JScrollPane(table1);

		// Add the scroll pane to this panel.
		add(scrollPane);
	}
	

	private void printDebugData(JTable table) {
		int numRows = table.getRowCount();
		int numCols = table.getColumnCount();
		TableModel model = table.getModel();

		System.out.println("Value of data: ");
		for (int i = 0; i < numRows; i++) {
			System.out.print("    row " + i + ":");
			for (int j = 0; j < numCols; j++) {
				System.out.print("  " + model.getValueAt(i, j));
			}
			System.out.println();
		}
		System.out.println("--------------------------");
	}

	public void GUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Hi-fidelity Headphones");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create and set up the content pane.
		Table newContentPane = new Table();
		newContentPane.setOpaque(true); // content panes must be opaque
		frame.setContentPane(newContentPane);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}
}

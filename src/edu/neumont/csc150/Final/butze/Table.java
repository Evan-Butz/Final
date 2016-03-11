package edu.neumont.csc150.Final.butze;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.TableModel;

public class Table extends JPanel {
	private boolean DEBUG = false;
	private HeadphoneSets hs = new HeadphoneSets();

	public Table() {
		super(new GridLayout(1, 0));
		
		final JTable table1 = new JTable(hs.getAllAttributes(), hs.getKeys());
		table1.setPreferredScrollableViewportSize(new Dimension(1700, 100));
		table1.setFillsViewportHeight(true);

		// Create the scroll pane and add the table to it.
		JScrollPane scrollPane = new JScrollPane(table1);

		// Add the scroll pane to this panel.
		add(scrollPane);
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

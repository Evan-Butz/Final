package edu.neumont.csc150.Final.butze;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.table.TableModel;

public class Table extends JPanel {
	Headphone data = new Headphone();
	private boolean DEBUG = false;

	public Table() {
		super(new GridLayout(1, 0));
		HeadphoneList hl = new HeadphoneList();

		String[] columnData = { "Brand", "Model", "Type", "Driver", "Frequency Response (Hz)", "Sensitivities",
				"Magnet", "Impedence (OHM)", "Weight", "Price" };

		Object[][] rowData = { 
				{ "Sony", "MDR-Z7", "Closed Back", "70mm", "4 - 100,000", "102 dB/mW", "Neodymium",
				"70Ω", "11.82 oz (Without Cord)", "$699.99" },
				{ "Sennheiser", "HD 800", "Open Back", "56mm", "6 - 51,000", "10 dB/mW", "Neodymium", "300Ω",
					"11.64 oz (Without Cord)", "$1499.95" },
				{ "Grado", "PS1000E", "Open Air", "50mm", "5 - 50,000", "98 dB/mW", "Neodymium", "32Ω", "24.10 oz (Without Cord)",
				"$1,695.00" },
				{ "Beyerdynamic", "T1 Tesla", "Semi-open Back", "51mm", "5 - 50,000", "102 dB/mW",
					"Neodymiom", "600Ω", "15.52 oz (Without Cord)", "$1,099.00" },
				{ "V-Moda", "M-100", "Closed Back", "50mm", "5 - 30,000", "103 dB/mW", "Neodymium", "32Ω",
						"9.88 oz (Without Cord)", "$270.00 - $27,000.00" }
		};
		final JTable table1 = new JTable(rowData, columnData);
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

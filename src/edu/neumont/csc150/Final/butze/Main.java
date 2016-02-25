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
	public void initilizeHeadphone(){
		Sony();
		Sennheiser();
		Grado();
		Beyerdynamic();
		VModa();
	}
	public void Sony(){
		Headphone h = new Headphone();
		h.mapBuild("Company", "Sony");
		h.mapBuild("Model", "MDR-Z7");
		h.mapBuild("Type", "Closed Back");
		h.mapBuild("Driver", "70mm");
		h.mapBuild("Frequency Response", "4 - 100,000");
		h.mapBuild("Sensativities", "102 dB/mW");
		h.mapBuild("Magnet", "Neodymium");
		h.mapBuild("Impedence", "70Ω");
		h.mapBuild("Weight", "11.82 oz (Without Cord)");
		h.mapBuild("Price", "$699.99");
	}
	public void Sennheiser(){
		Headphone h = new Headphone();
		h.mapBuild("Company", "Sennheiser");
		h.mapBuild("Model", "HD 800");
		h.mapBuild("Type", "Open Back");
		h.mapBuild("Driver", "56mm");
		h.mapBuild("Frequency Response", "6 - 51,000");
		h.mapBuild("Sensativities", "10 dB/mW");
		h.mapBuild("Magnet", "Neodymium");
		h.mapBuild("Impedence", "300Ω");
		h.mapBuild("Weight", "11.64 oz (Without Cord)");
		h.mapBuild("Price", "$1499.95");
	}
	public void Grado(){
		Headphone h = new Headphone();
		h.mapBuild("Company", "Grado");
		h.mapBuild("Model", "PS1000E");
		h.mapBuild("Type", "Open Air");
		h.mapBuild("Driver", "50mm");
		h.mapBuild("Frequency Response", "5 - 50,000");
		h.mapBuild("Sensativities", "98 dB/mW");
		h.mapBuild("Magnet", "Neodymium");
		h.mapBuild("Impedence", "32Ω");
		h.mapBuild("Weight", "24.10 oz (Without Cord)");
		h.mapBuild("Price", "$1695.00");
	}
	public void Beyerdynamic(){
		Headphone h = new Headphone();
		h.mapBuild("Company", "Beyerdynamic");
		h.mapBuild("Model", "T1 Tesla");
		h.mapBuild("Type", "Semi-Open Back");
		h.mapBuild("Driver", "51mm");
		h.mapBuild("Frequency Response", "5 - 50,000");
		h.mapBuild("Sensativities", "102 dB/mW");
		h.mapBuild("Magnet", "Neodymium");
		h.mapBuild("Impedence", "600Ω");
		h.mapBuild("Weight", "15.52 oz (Without Cord)");
		h.mapBuild("Price", "$1099.00");
	}
	public void VModa(){
		Headphone h = new Headphone();
		h.mapBuild("Company", "V-Moda");
		h.mapBuild("Model", "M-100");
		h.mapBuild("Type", "Closed Back");
		h.mapBuild("Driver", "50mm");
		h.mapBuild("Frequency Response", "5 - 30,000");
		h.mapBuild("Sensativities", "103 dB/mW");
		h.mapBuild("Magnet", "Neodymium");
		h.mapBuild("Impedence", "32Ω");
		h.mapBuild("Weight", "9.88 oz (Without Cord)");
		h.mapBuild("Price", "$270.00 - $27,000.00");
	}

}

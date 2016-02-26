package edu.neumont.csc150.Final.butze;

import java.util.ArrayList;

public class HeadphoneList {
	private ArrayList<Headphone> collection;
	public HeadphoneList(){
		collection = new ArrayList<Headphone>();
		collection.add(Sony());
		collection.add(Sennheiser());
		collection.add(Grado());
		collection.add(Beyerdynamic());
		collection.add(VModa());
	}
	public Headphone Sony(){
		Headphone h = new Headphone();
		h.sonyBuild("Company", "Sony");
		h.sonyBuild("Model", "MDR-Z7");
		h.sonyBuild("Type", "Closed Back");
		h.sonyBuild("Driver", "70mm");
		h.sonyBuild("Frequency Response", "4 - 100,000");
		h.sonyBuild("Sensativities", "102 dB/mW");
		h.sonyBuild("Magnet", "Neodymium");
		h.sonyBuild("Impedence", "70Ω");
		h.sonyBuild("Weight", "11.82 oz (Without Cord)");
		h.sonyBuild("Price", "$699.99");
		return h;
	}
	public Headphone Sennheiser(){
		Headphone h = new Headphone();
		h.sennheiserBuild("Company", "Sennheiser");
		h.sennheiserBuild("Model", "HD 800");
		h.sennheiserBuild("Type", "Open Back");
		h.sennheiserBuild("Driver", "56mm");
		h.sennheiserBuild("Frequency Response", "6 - 51,000");
		h.sennheiserBuild("Sensativities", "10 dB/mW");
		h.sennheiserBuild("Magnet", "Neodymium");
		h.sennheiserBuild("Impedence", "300Ω");
		h.sennheiserBuild("Weight", "11.64 oz (Without Cord)");
		h.sennheiserBuild("Price", "$1499.95");
		return h;
	}
	public Headphone Grado(){
		Headphone h = new Headphone();
		h.gradoBuild("Company", "Grado");
		h.gradoBuild("Model", "PS1000E");
		h.gradoBuild("Type", "Open Air");
		h.gradoBuild("Driver", "50mm");
		h.gradoBuild("Frequency Response", "5 - 50,000");
		h.gradoBuild("Sensativities", "98 dB/mW");
		h.gradoBuild("Magnet", "Neodymium");
		h.gradoBuild("Impedence", "32Ω");
		h.gradoBuild("Weight", "24.10 oz (Without Cord)");
		h.gradoBuild("Price", "$1695.00");
		return h;
	}
	public Headphone Beyerdynamic(){
		Headphone h = new Headphone();
		h.beyerBuild("Company", "Beyerdynamic");
		h.beyerBuild("Model", "T1 Tesla");
		h.beyerBuild("Type", "Semi-Open Back");
		h.beyerBuild("Driver", "51mm");
		h.beyerBuild("Frequency Response", "5 - 50,000");
		h.beyerBuild("Sensativities", "102 dB/mW");
		h.beyerBuild("Magnet", "Neodymium");
		h.beyerBuild("Impedence", "600Ω");
		h.beyerBuild("Weight", "15.52 oz (Without Cord)");
		h.beyerBuild("Price", "$1099.00");
		return h;
	}
	public Headphone VModa(){
		Headphone h = new Headphone();
		h.vmodaBuild("Company", "V-Moda");
		h.vmodaBuild("Model", "M-100");
		h.vmodaBuild("Type", "Closed Back");
		h.vmodaBuild("Driver", "50mm");
		h.vmodaBuild("Frequency Response", "5 - 30,000");
		h.vmodaBuild("Sensativities", "103 dB/mW");
		h.vmodaBuild("Magnet", "Neodymium");
		h.vmodaBuild("Impedence", "32Ω");
		h.vmodaBuild("Weight", "9.88 oz (Without Cord)");
		h.vmodaBuild("Price", "$270.00 - $27,000.00");
		return h;
	}
}

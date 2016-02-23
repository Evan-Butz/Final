package edu.neumont.csc150.Final.butze;

public class HeadphoneInfo {
	String[] Sony = { "Sony", "MDR-Z7", "Closed Back", "70mm", "4 - 100,000", "102 dB/mW", "Neodymium", "70Ω",
			"11.82 oz (Without Cord)", "$699.99" };
	String[] Sennheiser = { "Sennheiser", "HD 800", "Open Back", "56mm", "6 - 51,000", "10 dB/mW", "Neodymium", "300Ω",
			"11.64 oz (Without Cord)", "$1499.95" };
	String[] Grado = { "Grado", "PS1000E", "Open Air", "50mm", "5 - 50,000", "98 dB/mW", "Neodymium", "32Ω", "24.10 oz (Without Cord",
			"$1,695.00" };
	String[] Beyerdynamic = { "Beyerdynamic", "T1 Tesla", "Semi-open Back", "51mm", "5 - 50,000", "102 dB/mW",
			"Neodymiom", "600Ω", "15.52 oz (Without Cord)", "$1,099.00" };
	String[] VModa = { "V-Moda", "M-100", "Closed Back", "50mm", "5 - 30,000", "103 dB/mW", "Neodymium", "32Ω",
			"9.88 oz (Without Cord)", "$270.00 - $27,000.00" };

	public String[] getSony() {
		return Sony;
	}

	public String[] getSennheiser() {
		return Sennheiser;
	}

	public String[] getGrado() {
		return Grado;
	}

	public String[] getBeyerdynamic() {
		return Beyerdynamic;
	}

	public String[] getVModa() {
		return VModa;
	}

}

package javaProjectAuto;

public class Audi extends Auto {

	Audi() {
		setFarbe("Weiß");

	}

	Audi(int baujahr) {
		setFarbe("Weiß");
		if (baujahr >= 1950 && baujahr <= 2022) {
			setBaujahr(baujahr);
		} else {
			setBaujahr(0);
		}

	}

	Audi(String farbe, int baujahr) {

		setFarbe(farbe);
		if (baujahr >= 1910 && baujahr <= 2022) {
			setBaujahr(baujahr);
		} else {
			setBaujahr(0);
		}
	}

	@Override
	public void setFarbe(String farbe) {

		if (farbe.equalsIgnoreCase("blau") || farbe.equalsIgnoreCase("braun") || farbe.equalsIgnoreCase("schwarz"))
			super.farbe = farbe;
		else
			super.farbe = "Weiß";
	}

	
	public String bremsen() {

		return "Auto bremst mit Bremskraftverstärker";

	}

	public String fahren() {

		return "Auto fährt mit Turbo";
	}

}

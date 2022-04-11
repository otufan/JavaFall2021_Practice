package javaProjectAuto;

public class BMW extends Auto {

	BMW() {
		setFarbe("Weiß");

	}

	BMW(int baujahr) {
		setFarbe("Weiß");
		if (baujahr >= 1929 && baujahr <= 2022) {
			setBaujahr(baujahr);
		} else {
			setBaujahr(0);
		}

	}

	BMW(String farbe, int baujahr) {

		setFarbe(farbe);
		if (baujahr >= 1929 && baujahr <= 2022) {
			setBaujahr(baujahr);
		} else {
			setBaujahr(0);
		}
	}

	@Override
	public void setFarbe(String farbe) {

		if (farbe.equalsIgnoreCase("rosa") || farbe.equalsIgnoreCase("rosa") || farbe.equalsIgnoreCase("gelb"))
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

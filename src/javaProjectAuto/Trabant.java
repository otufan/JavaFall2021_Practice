package javaProjectAuto;

public class Trabant extends Auto{

	
	Trabant() {

	}

	Trabant(int baujahr) {
		setFarbe("Weiß");
		if (baujahr>=1929 && baujahr<=1990) {
			setBaujahr(baujahr);
		} else {
			setBaujahr(0);
		}
	}

	Trabant(String farbe, int baujahr) {		
				
		setFarbe(farbe);
		if (baujahr>=1929 && baujahr<=1990) {
			setBaujahr(baujahr);
		} else {
			setBaujahr(0);
		}
	}

	@Override
	public void setFarbe(String farbe) {
		
		if(farbe.equalsIgnoreCase("grau") ||farbe.equalsIgnoreCase("rosa")) 
			super.farbe=farbe;
		else super.farbe="Weiß";
	}
	
	@Override
	public String bremsen() {
		
		return "Auto bremst";
		
	}
	

}

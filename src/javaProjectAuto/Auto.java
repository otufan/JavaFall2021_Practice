package javaProjectAuto;

public abstract class Auto {

	protected String farbe = null;
	private int baujahr = 0;

	public Auto() {

	}

	public Auto(int baujahr) {

		setBaujahr(baujahr);
	}

	public Auto(String farbe, int baujahr) {

		this.farbe = farbe;
		setBaujahr(baujahr);

	}

	public String getFarbe() {
		return farbe;
	}

	public abstract void setFarbe(String farbe);

	public int getBaujahr() {
		return baujahr;
	}

	public void setBaujahr(int baujahr) {

		if (baujahr > 1886 && baujahr <= 2022) {
			this.baujahr = baujahr;
		} else {
			this.baujahr = 0;
		}

	}
	
	public String bremsen() {
		
		return "das Auto bremst";
		
	}
	
	public String fahren() {
		
		String fahren="die Methode getClass().getSimpleName : "+getClass().getSimpleName();
		return fahren;
	}

	@Override
	public String toString() {
		
		return "{ "+getClass().getSimpleName() +", Farbe=" + farbe + ", Baujahr=" + baujahr+", Bremsen="+bremsen()+", Fahren= "+fahren()+ "}";
	}
	
	

}

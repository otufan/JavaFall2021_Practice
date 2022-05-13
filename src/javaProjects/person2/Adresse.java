package javaProjects.person2;

public class Adresse{
	
	private String strasse;
	private String hausNr;
	private String plz;
	private String wohnort;
	
	public Adresse() {}

	public Adresse(String strasse, String hausNr, String plz, String wohnort) {
		
		setStrasse(strasse);
		setHausNr(hausNr);
		setPlz(plz);
		setWohnort(wohnort);
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausNr() {
		return hausNr;
	}

	public void setHausNr(String hausNr) {
		this.hausNr = hausNr;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getWohnort() {
		return wohnort;
	}

	public void setWohnort(String wohnort) {
		this.wohnort = wohnort;
	}

	@Override
	public String toString() {
		return " Adresse -> Straße=" + strasse + ", HausNr=" + hausNr + ", PLZ=" + plz + ", Wohnort=" + wohnort;
	}
	
	

}

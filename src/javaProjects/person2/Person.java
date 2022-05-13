package javaProjects.person2;

public class Person extends Adresse{

	private String name;
	private String vorname;
	private String geburtsdatum;
		
	public Person() {
		
	}

	public Person(String name, String vorname, String geburtsdatum) {
		
		setName(name);
		setVorname(vorname);
		setGeburtsdatum(geburtsdatum);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", Vorname=" + vorname + ", Geburtsdatum=" + geburtsdatum+ " Adresse -> Straße=" + this.getStrasse()+ ", HausNr=" + this.getHausNr() + ", PLZ=" + this.getPlz() + ", Wohnort=" + this.getWohnort();
	}
	
	
	
	
}

package javaProjects.Fahrzeuge;

public class Krankenwagen extends Auto {

	private boolean blauLicht;

	public Krankenwagen() {
		setPosition(0);
		setGeschwindigkeit(0);
		setAnzahlRaeder(0);
		setBlauLicht(blauLicht);

	}

	public Krankenwagen(double position, double geschwindigkeit, int anzahlRaeder, boolean blauLicht) {

		setPosition(position);
		setGeschwindigkeit(geschwindigkeit);
		setAnzahlRaeder(anzahlRaeder);
		setBlauLicht(blauLicht);
	}

	public boolean isBlauLicht() {
		return blauLicht;
	}

	public void setBlauLicht(boolean blauLicht) {
		this.blauLicht = blauLicht;
	}

	public void blauLichtEin() {

		setBlauLicht(true);

	}

	public void blauLichtAus() {

		setBlauLicht(false);

	}

}

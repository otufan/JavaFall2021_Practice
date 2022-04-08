package javaProjectsFahrzeuge;

public class Rennwagen extends Auto {

	public Rennwagen() {
		setPosition(0);
		setGeschwindigkeit(0);
		maxGeschwindigkeit(220);
		setAnzahlRaeder(0);

	}

	public Rennwagen(double position, double geschwindigkeit, int anzahlRaeder) {

		setPosition(position);
		setGeschwindigkeit(geschwindigkeit);
		maxGeschwindigkeit(140);
		setAnzahlRaeder(anzahlRaeder);
	}

}

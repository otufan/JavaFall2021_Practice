package javaProjectsFahrzeuge;

public class Auto extends Fahrzeug {

	public Auto() {
		setPosition(0);
		setGeschwindigkeit(0);
		maxGeschwindigkeit(140);
		setAnzahlRaeder(4);

	}

	public Auto(double position, double geschwindigkeit) {

		setPosition(position);
		setGeschwindigkeit(geschwindigkeit);
		maxGeschwindigkeit(140);
		setAnzahlRaeder(4);
	}

}

package javaProjectsFahrzeuge;

public class Fahrrad extends Fahrzeug {

	public Fahrrad() {

		setPosition(0);
		setGeschwindigkeit(0);
		maxGeschwindigkeit(30);
		setAnzahlRaeder(2);

	}

	public Fahrrad(double position, double geschwindigkeit) {

		setPosition(position);
		setGeschwindigkeit(geschwindigkeit);
		maxGeschwindigkeit(30);
		setAnzahlRaeder(2);
	}

}

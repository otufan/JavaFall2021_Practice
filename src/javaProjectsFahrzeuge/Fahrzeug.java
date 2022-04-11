package javaProjectsFahrzeuge;

public class Fahrzeug {

	private double position;
	private double geschwindigkeit;
	private double maxGeschwindigkeit;
	private int anzahlRaeder;

	public Fahrzeug() {
		setPosition(0);
		setGeschwindigkeit(0);
		maxGeschwindigkeit(0);
		setAnzahlRaeder(0);

	}

	public Fahrzeug(double position, double geschwindigkeit, double maxGeschwindigkeit, int anzahlRaeder) {

		setPosition(position);
		setGeschwindigkeit(geschwindigkeit);
		maxGeschwindigkeit(maxGeschwindigkeit);
		setAnzahlRaeder(anzahlRaeder);
	}

	public void bewege(double anzahlMin) {

		position = geschwindigkeit * (anzahlMin / 60);

	}

	public double getPosition() {
		return position;
	}

	public void setPosition(double position) {
		this.position = position;
	}

	public double getMaxGeschwindigkeit() {
		return maxGeschwindigkeit;
	}

	public void maxGeschwindigkeit(double maxGeschwindigkeit) {

		this.maxGeschwindigkeit = maxGeschwindigkeit;
	}

	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(double geschwindigkeit) {

		if (geschwindigkeit <= maxGeschwindigkeit) {
			this.geschwindigkeit = geschwindigkeit;
		} else this.geschwindigkeit=maxGeschwindigkeit;
		

	}

	public int getAnzahlRaeder() {
		return anzahlRaeder;
	}

	public void setAnzahlRaeder(int anzahlRaeder) {
		this.anzahlRaeder = anzahlRaeder;
	}

	@Override
	public String toString() {
		return "Position=" + position + ", Geschwindigkeit=" + geschwindigkeit + ", max Geschwindigkeit="
				+ maxGeschwindigkeit + ", Anzahl der Räder=" + anzahlRaeder;
	}

}

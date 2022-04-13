package javaProjectsFahrzeuge;

public class Rennwagen extends Auto {

	public Rennwagen() {
		setPosition(0);
		setGeschwindigkeit(0);
		maxGeschwindigkeit(220);
		

	}

	public Rennwagen(double position, double geschwindigkeit) {

		setPosition(position);
		setGeschwindigkeit(geschwindigkeit);
		maxGeschwindigkeit(140);
		
	}

}

package javaProjectsFahrzeuge;

public class Wettrennen {

	public static void main(String[] args) {

		Fahrrad fahrrad = new Fahrrad();
		Auto auto = new Auto();
		Rennwagen rennwagen = new Rennwagen();
		Krankenwagen krankenwagen = new Krankenwagen();

		fahrrad.setGeschwindigkeit(20);
		auto.setGeschwindigkeit(150);
		rennwagen.setGeschwindigkeit(200);
		krankenwagen.setGeschwindigkeit(80);

		fahrrad.bewege(240);
		auto.bewege(60);
		rennwagen.bewege(60);
		krankenwagen.bewege(60);

		System.out.println("******** die aktuellen Positionen *********");
		
		System.out.printf("Fahrad : %.0f%nAuto : %.0f%nRennwagen : %.0f%nKrankenwagen : %.0f%n", 
				fahrrad.getPosition(),
				auto.getPosition(), 
				rennwagen.getPosition(), 
				krankenwagen.getPosition());
		
		System.out.println("\nFahrad \t\t: " + fahrrad + "\nAuto \t\t: " + auto + "\nRennwagen \t: " + rennwagen + "\nKrankenwagen \t: " + krankenwagen);

	}

}

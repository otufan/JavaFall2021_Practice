package javaProjects.person;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMethoden {

	public void hinzufugen(ArrayList<Person> personArray) {

		Person person = new Person();
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Name ein ;");

		person.setName(scan.nextLine());
		System.out.println("Bitte geben Sie die Vorname ein ;");

		person.setVorname(scan.nextLine());
		System.out.println("Bitte geben Sie das Geburtsdatum ein ;");
		person.setGeburtsdatum(scan.nextLine());

		personArray.add(person);

	}

	public void suchen(ArrayList<Person> personArray) {

		Scanner scan = new Scanner(System.in);

		boolean control = false;

		String nachname = "";

		System.out.println("Welche Nachname suchen Sie :");
		nachname = scan.nextLine();

		for (Person person : personArray) {

			if (person.getName().equalsIgnoreCase(nachname)) {

				System.out.println(person.toString());
				control = true;
			}

		}

		if (!control) {
			System.out.println("die eingegebene Nachname existiert nicht !");
		}

	}

	public void loeschen(ArrayList<Person> personArray) {

		boolean control = false;
		String nachname = "";
		Scanner scan = new Scanner(System.in);

		System.out.println("Welche Nachname möchten Sie löschen ");

		nachname = scan.nextLine();

		for (Person person : personArray) {

			if (person.getName().equalsIgnoreCase(nachname)) {

				personArray.remove(person);
				control = true;
				break;
			}

		}

		if (!control) {
			System.out.println("die eingegebene Nachname existiert nicht !");
		}

	}

	public void aendern(ArrayList<Person> personArray) {

		boolean control = false;
		String nachname = "";
		String auswahl = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Sie den Nachnamen der Person ein, deren Informationen Sie ändern möchten: ");
		nachname = scan.nextLine();

		for (Person person : personArray) {

			if (person.getName().equalsIgnoreCase(nachname)) {

				do {
					System.out.println("Welche Information möchten Sie ändern : ");
					System.out.println("1-Nachname\n2-Vornam\n3-Geburtsdatum\n4-Exit");
					auswahl = scan.nextLine();

					switch (auswahl) {
					case "1":
						System.out.println("Bitte geben Sie die neue Nachname ein : ");
						person.setName(scan.nextLine());
						break;
					case "2":
						System.out.println("Bitte geben Sie die neue Vorname ein : ");
						person.setName(scan.nextLine());
						break;
					case "3":
						System.out.println("Bitte geben Sie das neue Geburtsdatum ein : ");
						person.setName(scan.nextLine());
						break;
					case "4":
						System.out.println("die Änderung/-en wurde gespeichert !");
						System.out.println("******************************\n"+person.toString()+"\n******************************\n");
						break;
					default:
						System.out.println("Bitte geben Sie eine richtige Nummer ein ! (1-4)");
						break;
					}

				} while (!auswahl.equalsIgnoreCase("4"));

				
				control = true;
			}

		}

		if (!control) {
			System.out.println("die eingegebene Nachname existiert nicht !");
		}
	}

	public void aus(ArrayList<Person> personArray) {

		for (Person test2 : personArray) {
			System.out.println(test2.toString());
		}

	}

	public void menue(ArrayList<Person> personArray) {
		Scanner scan = new Scanner(System.in);
		String auswahl = "";

		do {
			System.out.println(
					"1-neue Person hinzufügen \n2-Person suchen\n3-Person löschen\n4-Info einer Person ändern\n5-Liste ausgeben\n6-Raus");
			auswahl = scan.nextLine();

			switch (auswahl) {
			case "1":
				hinzufugen(personArray);
				break;
			case "2":
				suchen(personArray);
				break;
			case "3":
				aus(personArray);
				loeschen(personArray);
				break;
			case "4":
				aus(personArray);
				aendern(personArray);
				break;
			case "5":
				aus(personArray);
				break;
			case "6":
				System.out.println("Vielen Dank");
				break;
			default:
				System.out.println("Bitte geben Sie eine richtige Nummer ein ! (1-5)");
				break;
			}

		} while (!auswahl.equalsIgnoreCase("6"));

	}

}

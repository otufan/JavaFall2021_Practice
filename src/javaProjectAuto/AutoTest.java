package javaProjectAuto;

import java.util.Arrays;
import java.util.Scanner;

public class AutoTest {
	
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		String farbe="";
		int baujahr=0;
		int count=0;
		int auswahl=0;
		Auto[] autoArray=new Auto[10];
		
		/*
		 * Audi a1=new Audi(); Audi a2=new Audi(2001); Audi a3=new Audi("Blau",2010);
		 * 
		 * a1.setFarbe("aaa"); a1.setBaujahr(1890);
		 * 
		 * 
		 * System.out.println("********* Audi 1 - ohne Parameter Auto ***********");
		 * System.out.println("Audi 1 hat die Farbe " + a1.getFarbe() + " und wurde " +
		 * a1.getBaujahr() +" gebaut");
		 * 
		 * System.out.
		 * println("\n********* Auto 2 - mit 1 Parameter Konstruktor  *************");
		 * System.out.println("Audi 2 hat die Farbe " + a2.getFarbe() + " und wurde " +
		 * a2.getBaujahr() +" gebaut");
		 * 
		 * System.out.
		 * println("\n********* Auto 3 - mit Parameter Konstruktor **********");
		 * System.out.println("Audi 3 hat die Farbe " + a3.getFarbe() + " und wurde " +
		 * a3.getBaujahr() +" gebaut");
		 * 
		 * BMW b1=new BMW(); BMW b2=new BMW(2015); BMW b3=new BMW("Rosa", 2022);
		 * 
		 * b1.setBaujahr(1900); b1.setFarbe("eee");
		 * 
		 * System.out.println("\n********* BMW 1 - ohne Parameter Auto ***********");
		 * System.out.println("BMW 1 hat die Farbe " + b1.getFarbe() + " und wurde " +
		 * b1.getBaujahr() +" gebaut");
		 * 
		 * System.out.
		 * println("\n********* BMW 2 - mit 1 Parameter Konstruktor  *************");
		 * System.out.println("BMW 2 hat die Farbe " + b2.getFarbe() + " und wurde " +
		 * b2.getBaujahr() +" gebaut");
		 * 
		 * System.out.println("\n********* BMW 3 - mit Parameter Konstruktor **********"
		 * ); System.out.println("BMW 3 hat die Farbe " + b3.getFarbe() + " und wurde "
		 * + b3.getBaujahr() +" gebaut");
		 * 
		 * Trabant t1=new Trabant(); Trabant t2=new Trabant(1950); Trabant t3=new
		 * Trabant("Grau", 1980);
		 * 
		 * t1.setBaujahr(2021); t1.setFarbe("grau");
		 * 
		 * System.out.println("\n********* Trabant 1 - ohne Parameter Auto ***********"
		 * ); System.out.println("Trabant 1 hat die Farbe " + t1.getFarbe() +
		 * " und wurde " + t1.getBaujahr() +" gebaut");
		 * 
		 * System.out.
		 * println("\n********* Trabant 2 - mit 1 Parameter Konstruktor  *************"
		 * ); System.out.println("Trabant 2 hat die Farbe " + t2.getFarbe() +
		 * " und wurde " +t2.getBaujahr() +" gebaut");
		 * 
		 * System.out.
		 * println("\n********* Trabant 3 - mit Parameter Konstruktor **********");
		 * System.out.println("Trabant 3 hat die Farbe " + t3.getFarbe() + " und wurde "
		 * + t3.getBaujahr() +" gebaut");
		 * 
		 * System.out.
		 * println("\n************ Testen die Methode von bremsen und fahren *************\n"
		 * ); System.out.println("Audi"); System.out.println(a1.fahren());
		 * System.out.println(a1.bremsen()); System.out.println("\nBMW");
		 * System.out.println(b1.fahren()); System.out.println(b1.bremsen());
		 * System.out.println("\nTrabant"); System.out.println(t1.fahren());
		 * System.out.println(t1.bremsen());
		 * 
		 * System.out.
		 * println("\n************ Testen die Methode toString *************\n");
		 * System.out.println(a2); System.out.println(b3); System.out.println(t3);
		 */
		
		System.out.println("\n************ Objekte in Array *************\n");
		
		do {
			System.out.print("1-BMW\n2-Audi\n3-Trabant\nWelcehes Auto möchten Sie einfügen :");
			auswahl=scan.nextInt();
			
			switch (auswahl) {
			
			case 1: 
				System.out.print("Bitte geben Sie die Farbe vom Auto ein : ");
				farbe=scan.next();
				System.out.print("Bitte geben Sie das Baujahr vom Auto ein : ");
				baujahr=scan.nextInt();				
				BMW bmw=new BMW(farbe, baujahr);
				autoArray[count]=bmw;
				count++;				
				break;
			case 2: 
				System.out.print("Bitte geben Sie die Farbe vom Auto ein : ");
				farbe=scan.next();
				System.out.print("Bitte geben Sie das Baujahr vom Auto ein : ");
				baujahr=scan.nextInt();				
				Audi audi=new Audi(farbe, baujahr);
				autoArray[count]=audi;
				count++;				
				break;
			case 3: 
				System.out.print("Bitte geben Sie die Farbe vom Auto ein : ");
				farbe=scan.next();
				System.out.print("Bitte geben Sie das Baujahr vom Auto ein : ");
				baujahr=scan.nextInt();				
				Trabant trabant=new Trabant(farbe, baujahr);
				autoArray[count]=trabant;
				count++;				
				break;

			default:
				System.out.println("Bitte gültige Nummer wählen Sie aus !");
				break;
			}
			
			System.out.println("Möchten Sie ein neues Auto einfügen?\n(1-Ja, 2-Nein)");
			auswahl=scan.nextInt();
			
		} while (auswahl==1 && count<10);
		
		
		System.out.println("Eingebebene Auto : " + Arrays.toString(autoArray));
		scan.close();

	}

}

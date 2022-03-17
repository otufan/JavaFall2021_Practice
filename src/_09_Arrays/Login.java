package _09_Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Login {

	public static void main(String[] args) throws FileNotFoundException {
		
			
		System.out.println("\033[4;34m*********** Willkomen *************");


	        while (passCheck()) {
	            menu();
	            break;
	        }

	        System.out.println("\033[4;31mAuf Wiedersehen!!!");

	    }

	    public static boolean passCheck() throws FileNotFoundException {
	        
	    	Scanner login=new Scanner(new File("C:\\Users\\omert\\eclipse-workspace\\U21Koeln\\src\\deneme\\login.csv"));
	    	
	    	Scanner scan = new Scanner(System.in);
	        String userName = "";
	        String pass = "";
	        boolean erg = false;

	        int count = 0;

	        do {
	            if (count >= 1) {
	                System.out.println("\033[4;35mSie haben noch " + (5 - count) + " Rechte, die richtige Benutzername und Passwort einzugeben !!! ");
	            }

	            System.out.print("\033[4;31mBitte geben Sie Ihre Benutzername ein : ");
	            userName = scan.nextLine();
	            System.out.print("\033[4;31mBitte geben Sie Ihr Passwort ein : ");
	            pass = scan.nextLine();

	            if (login.findInLine(Pattern.compile(userName + " " +pass)) != null) {
	            	erg=true;
	    			
	    		}

	            count++;
	            if (count == 5) {
	                System.out.println("\033[4;36mSie haben keine Recht zu login !!! ");
	            }

	        } while (!erg && count < 5);

	        return erg;
	    }

	    public static void menu() {
	        System.out.println("\033[4;36mHerzlichen Glückwunsch \nWillkomen im Menu");
	        Scanner scan = new Scanner(System.in);

	        int menu = 0;

	        while (menu != 5) {

	            System.out.println("\033[4;32m************* MENU ************** \n1-ein neues Array erstellen \n2-eine Zahl suchen \n3-Array sortieren \n4-Min und Max Elemente des Arrays \n5-Exit");
	            System.out.print("\033[4;36mBitte wählen Sie aus, was Sie möchten : ");
	            menu = scan.nextInt();

	            switch (menu) {
	                case 1:
	                    arrayCreate();
	                    break;
	                case 2:
	                    zahlSuchen();

	                    break;
	                case 3:
	                    sortieren();

	                    break;
	                case 4:
	                    minMax();

	                    break;
	                case 5:
	                    System.out.println("\033[4;32mVielen Dank !");

	                    break;
	                default:
	                    System.out.println("\033[4;35mBitte geben Sie richtige Nummer ein !");

	            }

	        }

	    }

	    public static int[] arrayCreate() {
	        Scanner scan = new Scanner(System.in);
	        Random random = new Random();
	        System.out.print("\033[4;31mBitte geben Sie die Anzahl der Elemente Array ein: ");
	        int anzahl = scan.nextInt();

	        int[] arr = new int[anzahl];

	        for (int i = 0; i < arr.length; i++) {

	            arr[i] = random.nextInt(100);

	        }

	        System.out.println("\033[4;32mdas Array : " + Arrays.toString(arr));
	        return arr;

	    }

	    public static void zahlSuchen() {
	        Scanner scan = new Scanner(System.in);

	        int[] arr = arrayCreate();

	        System.out.print("\033[4;32mWelche zahl suchen Sie : ");

	        int sucht = scan.nextInt();

	        int flag = 0;
	        for (int i = 0; i < arr.length; i++) {

	            if (arr[i] == sucht) {
	                flag++;
	            }
	        }

	        if (flag != 0) {
	            System.out.println("\033[4;34mdie Zahl (" + sucht + ") " + flag + " mal existiert");

	            System.out.print("\033[4;31mIndexes von der Zahl " + sucht + " sind :");

	            for (int i = 0; i < arr.length; i++) {

	                if (arr[i] == sucht) {
	                    System.out.print(i + " ");
	                }
	            }

	            System.out.println("");
	            System.out.print("\033[4;31mdie Zahl (" + sucht + ") sind :");

	            for (int i = 0; i < arr.length; i++) {

	                if (arr[i] == sucht) {
	                    System.out.print((i + 1) + ". ");
	                }
	            }

	            System.out.println(" Elemente des Arrays");
	        } else {
	            System.out.println("\033[4;34mIm Array gibt es diese Zahl " + sucht + " nicht!");

	        }

	    }

	    public static void sortieren() {

	        int[] arr = arrayCreate();

	        int a = arr[0];

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr.length; j++) {

	                if (arr[i] < arr[j]) {
	                    a = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = a;
	                }

	            }
	        }

	        System.out.println("\033[4;34mdas sortierte Array : " + Arrays.toString(arr));

	    }

	    public static void minMax() {

	        int[] arr = arrayCreate();

	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;

	        for (int i = 0; i < arr.length; i++) {

	            if (arr[i] >= max) {
	                max = arr[i];

	            }
	            if (arr[i] <= min) {
	                min = arr[i];

	            }

	        }
	        System.out.println("Max : " + max);
	        System.out.println("Min : " + min);

	    

	}

}

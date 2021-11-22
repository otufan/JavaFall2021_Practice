package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy/100*boy/100)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen boyonuzu cm olarak giriniz:");
		
		double boy=scan.nextDouble();
		
		System.out.print("Lutefen kilonuzu kg olarak giriniz:");
		
		double agirlik=scan.nextDouble();
		
		double bmi=agirlik/(boy*boy/10000);
		
		System.out.println("Vucut kitle indexiniz:" + bmi);
		
		if (bmi>30) { System.out.println("Obez grubunda yer almaktasiniz!!!");
			
		} 
		else if (bmi>25) {System.out.println("Sisman grubunda yer almaktasiniz!!!");

		}
		else if (bmi>20){System.out.println("Normal sinirlar icindesiniz");
			
		}
		else { System.out.println("Oldukca zayifsiniz!!!");
			
		}
    
		scan.close();
	
	}

}

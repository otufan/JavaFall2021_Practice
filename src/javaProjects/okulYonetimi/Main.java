package javaProjects.okulYonetimi;

import java.util.Scanner;

public class Main extends Islemler {
	
	static{
		System.out.println("==========================================");
		System.out.println("----Ogrenci ve Ogretmen Yonetim Paneli----");
		System.out.println("==========================================");
		System.out.println("---> 1- Ogrenci Islemleri         --------");
		System.out.println("---> 2- Ogretmen Islemleri        --------");
		System.out.println("---> Q- Cikis                     --------");
		
	}
    public static void main(String[] args) {
    	
    
    	Scanner scan=new Scanner(System.in);
    	
    	secim(anaSecim());
    	
    	
    	

    }


}

package javaProjects.okulYonetimi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import _11_dateTime.HaftaninSorusu.User;

public class Islemler implements Ogrenci,Ogretmen{

	String adSoyad;
	int kimlikNo;
	int yas;
	List<Islemler> listeOgrenci=new ArrayList<>();
	List<Islemler> listeOgretmen=new ArrayList<>();
	Scanner scan=new Scanner(System.in);
	Islemler(){
		
	}
	
	Islemler(String adSoyad, String kimlikNo, int yas, String SicilnumaraOkulNumara, String sinifBolum){
		
		
	}
	
	public List<Islemler> eklemeOgrenci() {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen ad soyad bilgisini giriniz: ");
		String adSoyad=scan.nextLine();
		System.out.print("Lutfen kimlik numarasini giriniz: ");
		String kimlikNo=scan.nextLine();
		System.out.print("Lutfen yasi giriniz: ");
		int yas=scan.nextInt();
				
		Islemler user=new Islemler(adSoyad, kimlikNo, yas, ogrenciNumara(), ogrenciSinif());
		listeOgrenci.add(user);
		return listeOgrenci;
	}
	
	public List<Islemler> eklemeOgretmen() {
	
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen ad soyad bilgisini giriniz: ");
		String adSoyad=scan.nextLine();
		System.out.print("Lutfen kimlik numarasini giriniz: ");
		String kimlikNo=scan.nextLine();
		System.out.print("Lutfen yasi giriniz: ");
		int yas=scan.nextInt();
				
		Islemler user=new Islemler(adSoyad, kimlikNo, yas, ogretmenSicilNo(), ogretmenBolum());
		listeOgretmen.add(user);
		return listeOgretmen;
	}
	
	public static String anaSecim() {
		String secim=null;
		Scanner scan=new Scanner(System.in);
    	System.out.print("Lutfen giris yapmak istediginiz menuyu seciniz : ");
    	String giris=scan.nextLine();
    	while(!giris.contains("1")&&!giris.contains("2")&&!giris.toLowerCase().contains("q")) {
    	System.out.println("Hatali giris yaptiniz \nLutfen tekrar giris yapiniz :");
    	giris=scan.nextLine();
		} 
    	
    	secim=giris;
    			
    	return secim;
		
	}
	
	public static void secim(String secim) {
		
		if (secim.contains("1")||secim.contains("2") ) { 
			
			System.out.println("======Islemler======");
			System.out.println("1- Ekleme ");
			System.out.println("2- Arama");
			System.out.println("3- Listeleme");
			System.out.println("4- Silme");
			System.out.println("5-Ana Menu");
			System.out.println("Q- Cikis");
			
			
		} else if (secim.toLowerCase().contains("q")) {
		
		System.out.println("Cikis isleminiz basarili bir sekilde gerceklestirilmistir!");
			
		} 
		
	}
	
	@Override
	public String ogretmenSicilNo() {
		String ogretmenSicilNo=scan.nextLine();
		return ogretmenSicilNo;
	}

	@Override
	public String ogretmenBolum() {
		String ogretmenBolum=scan.nextLine();
		return ogretmenBolum;
	}

	@Override
	public String ogrenciNumara() {
		String ogrenciNumara=scan.nextLine();
		return ogrenciNumara;
	}

	@Override
	public String ogrenciSinif() {
		String ogrenciSinif=scan.nextLine();
		return ogrenciSinif;
	}



}

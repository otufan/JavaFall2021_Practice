package javaProjects.OgrenciIsleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Service {

	List<Ogrenci> student=new ArrayList<>(); 

	Scanner scan=new Scanner(System.in);
	
	public boolean menu() {
		boolean durum=false;
		
		System.out.println("SECIMINIZI YAPINIZ : ");
		String giris=scan.next();
		while(giris.matches("[a-zA-Z]+"))
			
			{System.out.println("LUTFEN SAYI GIRINIZ : ");
			giris=scan.next();}
		try {
			
			
			switch (Integer.parseInt(giris)) {
			case 1:studentRegister(); durum=true;
			break;
			case 2:studentDelete(); durum=true;
			break;
			case 3:studentList(); durum=true;
			break;
			case 4:System.out.println("Cikis islemi yaptiniz tesekkur");
			durum=false;
			break;
			default:System.out.println("Yanlis giris yaptiniz. Tekrar deneyin");
			durum=true;
			break;
			}
			
		} catch (Exception e) {
			
			System.out.print("Lutfen gecerli bir sayi giriniz");
			System.out.println(e);
			menu();
		}
	
		return durum;
		
	}
	
	public List<Ogrenci> studentRegister() {
		
		Ogrenci kayit=new Ogrenci();
		System.out.println("Lutfen ogrenci bilgilerini giriniz ");
		
		
		System.out.println("Ogrenci Adi : ");
		kayit.setName(scan.next());
		
		
		System.out.println("Ogrenci Soyadi : ");
		kayit.setSurname(scan.next());
		
		
		System.out.println("Ogrenci numarasi : ");
		kayit.setNumber(scan.nextInt());
		
		
		System.out.println("Ogrenci ortalamasi : ");
		kayit.setAvg(scan.nextDouble());
		
		student.add(kayit);
		
		return student;
		
	}
	
	public void studentList() {
		
		System.out.println(student.toString());
						
	}
	
	public List<Ogrenci> studentDelete() {
		
		System.out.println(student.toString());
		System.out.println("Silmek istediginiz ogrenicinin numarasini giriniz: ");
		
		
		
		student.removeAll(findByNummer());
		
		return student;
				
	}
	
	public List<Ogrenci> findByNummer(){
		
		
		int nummer=scan.nextInt();
		
		return student.stream().filter(t->t.getNumber()==nummer).toList();
		
		
		
	}
	
	
}

package javaProjects.OgrenciIsleri;


public class Runner extends Service {
	
	static {
	System.out.println("*** Ogrenci Islemlerine hosgeldiniz  ****");	
	System.out.println("*** Yapacaginiz islemi seciniz       ****");	
	System.out.println("*** 1- Ogrenci ekleme                ****");	
	System.out.println("*** 2- Ogrenci silme                 ****");	
	System.out.println("*** 3- Ogrenci listesini goruntuleme ****");
	System.out.println("*** 4- Cikis                         ****");
		
	}

	public static void main(String[] args) {
		
		Runner runner=new Runner();
		
		
		while (runner.menu()) {
			runner.menu();
			
	}

	}

}

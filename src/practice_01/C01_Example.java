package practice_01;

public class C01_Example {

	public static void main(String[] args) {
		
		//verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru yazdiriniz
		//ex: input:12345
		//output:1
		//		2
		//		3
		//		4
		//		5
		
		
		int sayi=12345;
		
		int birler=sayi%10;  //birler basamagi sayinin 10 a bolumunden kalanidir
		int onlar=(sayi/10)%10;
		int yuzler=(sayi/100)%10;
		int binler=(sayi/1000)%10;
		int onBinler=(sayi/10000);
		
		/*
		System.out.println(onBinler); //bu sekilde cok uzun
		System.out.println(binler);
		System.out.println(yuzler);
		System.out.println(onlar);
		System.out.println(birler);
		*/
		
		//consalda alt satira yazdirmak icin "\n" komutu kullanilir...
		System.out.println(onBinler + "\n" + binler + "\n" + yuzler + "\n" + onlar + "\n" + birler);
		
	
		
		
	}
}

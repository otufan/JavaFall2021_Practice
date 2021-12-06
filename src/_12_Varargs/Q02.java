package _12_Varargs;

public class Q02 {
	public static void main(String[] args) {
		         // verilen int lerden ilki haric tum sayilari toplayan ve
				// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

		
		ozelIslem(12,2,3,4,5);
		
		
		
	}

	public static void ozelIslem(int i, int... j) {
		int toplam=0;
		
		for (int each:j) {
			toplam+=each;
		}
		toplam*=i;
		
		System.out.println(toplam);
	}

}

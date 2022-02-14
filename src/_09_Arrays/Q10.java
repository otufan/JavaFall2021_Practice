package _09_Arrays;



public class Q10 {

	public static void main(String[] args) {
		/*  you have a string "GayetBasarılı"
	        * with arrays change it to "CoookBasarılı" and write changing array
			*(String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )
			*
			*/
		String str="GayetBasarılı";
		String arr[]=str.split("");
		
		String str2="Coook";
		String gecis[]=str2.split("");
		
		for (int i = 0; i < gecis.length; i++) {
			arr[i]=gecis[i];
		}

		for (int i = 0; i < arr.length; i++) {
					
		System.out.print(arr[i]);
	}
	}

}

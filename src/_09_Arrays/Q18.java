package _09_Arrays;



import java.util.Arrays;
public class Q18 {

	public static void main(String[] args)
	{
		 // kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
        // String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
        // { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
		
		String str="Javacilar cook afilli";
		String str2="";
		for (int i = 0; i < str.length(); i++) {
		if(!str2.contains(str.substring(i, i+1))) {
			str2+=str.substring(i, i+1);
		}
			
		}
		
		
		String arr[]=str.split("");
		String arr2[]=str2.split("");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		System.out.print("{");
		int toplam;
		for (int i = 0; i < arr2.length; i++) {
		toplam=0;
		
			for (int j = 0; j < arr.length; j++) {
				
				if (arr[i].contains(arr[j])) {
					toplam++;
					
				}
								
			}
			
			System.out.print(arr[i]+" = "+ toplam+ " ");
		}
		
		
		System.out.println("}");
		
		
		
	}
}



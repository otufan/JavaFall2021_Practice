package javaProjects.kitapYonetimi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KitapDepo {

	
	String yazar;
	String kitapIsmi;
	int kitapNo;
	
	static List<String> menu=Arrays.asList("1. Kitap Ekle" , "2. Kitap Sil",
			"3. kitaplari Listele" , "4. Cikis");
	protected KitapDepo() {
		
	}

	protected KitapDepo(String kitapIsmi, String yazar, int kitapNo) {
		
	}
}

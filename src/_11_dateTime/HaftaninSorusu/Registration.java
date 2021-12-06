package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {

	List<User> kullanicilar=new ArrayList<>();
	
	
	public List<User> register() {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen kullanici adinizi giriniz: ");
		String isim=scan.nextLine();
		User user=new User(isim, LocalDateTime.now());
		kullanicilar.add(user);
		return kullanicilar;
	}
	
	public void printHappyUsers(ArrayList<User> users) {
		
		for (User each:users) {
			
			if (each.registerDate.getSecond()<10) { System.out.println("Sansli kullanici : " + each.name);
				
			}else { System.out.println("Malesef sansli kisiler arasina giremediniz : " + each.name);
				
			}
			
		}
		
	}
	
	public void listele(ArrayList<User> users) {
		for (User each:users) {
			System.out.println("Kullanici adi : " + each.name+" kayit zamani : " + each.registerDate );
		}
		
	}
	
}

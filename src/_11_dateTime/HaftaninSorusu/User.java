package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;

public class User {
	
	
	
	String name;
	LocalDateTime registerDate;

	
	public User(String name, LocalDateTime registerDate) {
		this.name=name;
		this.registerDate=registerDate;
	}
	
	public User() {}
}

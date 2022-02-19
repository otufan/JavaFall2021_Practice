package javaProjects.OgrenciIsleri;

public class Ogrenci {
	
	private String name;
	private String surname;
	private int number;
	private double avg;
	
	public Ogrenci() {
		super();
	}

	public Ogrenci(String name, String surname, int number, double avg) {
		
		this.name = name;
		this.surname = surname;
		this.number = number;
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "{Ogrenci adi ve Soyadi =" + name + " " + surname + ", Numarasi=" + number + ", Ortalamasi=" + avg+"}" ;
	}
	
	
	

}

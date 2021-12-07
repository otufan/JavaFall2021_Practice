package _14_Encapsulation.Q01;

public class ArabaMain {

	public static void main(String[] args) {
		
		Araba honda=new Araba();
		honda.setMotor(1300);
		honda.setModel("civic");
		honda.setYil(2021);
		honda.getModel();
		System.out.println(honda.getYil());
		
		Araba volvo=new Araba("xc90", "Beyaz", 20, 2020);
		Araba ww=new Araba("Passat", "Gri", 1600, -2021);
		
		
		System.out.println("sectiginiz arac volvo --->" + volvo.getYil()+ " " + volvo.getRenk()+" " + volvo.getMotor());
		System.out.println("sectiginiz arac ww --->" + ww.getYil()+" " + ww.getRenk()+" " + ww.getMotor());
		
		
	}

}

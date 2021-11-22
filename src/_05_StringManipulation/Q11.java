package _05_StringManipulation;

public class Q11 {
    public static void main(String[] args) {
	/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

    	String pickName="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	
    	char A=pickName.charAt(pickName.indexOf("A"));
    	char L=pickName.charAt(pickName.indexOf("L"));
    	String i=pickName.substring(pickName.indexOf("I"),(pickName.indexOf("I")+1) ).toLowerCase();
    	
    	System.out.println(A+ " " + L + " " +i);
       
    }

}

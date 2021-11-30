package _10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiriniz
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */

    	Scanner scan=new Scanner(System.in);
    	System.out.print("Lutfen bir String deger giriniz : ");
    	String str=scan.nextLine();
    	str=str.replaceAll("\\s", "");
    	str=str.toLowerCase();
    	String arr[]=str.split("");
    	List<String> lst=new ArrayList<>();
    	for (int i = 0; i < arr.length; i++) {
    		lst.add(arr[i]);
			
		}
    	
    	Collections.sort(lst);
    	
    	System.out.println(lst);
    	
    	int say=0;
    	int max=0;
    	int index=0;
    	
    	for (int i = 0; i < lst.size(); i++) {
    		say=0;
    		for (int j = 0; j < lst.size(); j++) {
    			if (lst.get(i).contains(lst.get(j))) {say++;
					
				}
				
    			if (say>max) { max=say;
    							index=i;
					
				}
			}
			
		}
    	
    	System.out.println("Girilen string deger de en cok gecen karakter : <<<< " +lst.get(index) + " >>>>> toplam : " + max + " adet vardir");
    	scan.close();
    }
}


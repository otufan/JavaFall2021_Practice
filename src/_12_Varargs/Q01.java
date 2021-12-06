package _12_Varargs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		//  verilen Stringleri birlestiren concat isimli bir method olusturunuz
		// input : "m", "e", "r", "v", "e";
		// output : merve

	String a="m";
	String b="e";
	String c="r";
	String d="v";
	String e="e";
	concat(a,b,c,d,e);
	
	String arr[]= {"Cok"," calisirsan ","basarabilirsin ","adamim"};
	concat(arr);
	
	}

	public static void concat(String ... string ) {
		
		String toplam="";
		
		for (String each : string) {
			toplam=toplam.concat(each);
		}
		
		System.out.println(toplam);
	}

}

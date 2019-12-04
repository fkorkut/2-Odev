package com.uniyaz;

import java.util.Scanner;

public class SayisalIslemler {
	Scanner scanner=new Scanner(System.in);
	
	public void ciftSayilariBul () {
		
		 System.out.println("Sayýyý yazýnýz.");
		 int sayi=scanner.nextInt();
		 for(int i=1;i<sayi;i++) {
			 if(i%2==0) {
				 System.out.print(i+"\t");
			 }
			 
		 }
	}
	public void tekSayilariBul() {
		System.out.println("Sayýyý yazýnýz.");
		 int sayi=scanner.nextInt();
		 for(int i=1;i<sayi;i++) {
			 if(i%2!=0) {
				 System.out.print(i+"\t");
			 }
			 
		 }
	}
}

package com.uniyaz;

import java.util.Scanner;

public class StringIslem {
	
	Scanner scanner=new Scanner(System.in);
	
	public void  terstenYazdir() {
		
		 System.out.println("C�mle yaz�n�z.");
		 
		 String cumle=scanner.nextLine();
		 
		 for(int i=cumle.length()-1;i>0;i--) {
			 System.out.print(cumle.charAt(i));
		 }
		
		
	}
	public void testLYazdir() {
		
		 System.out.println("Y�ld�z say�s�n� yaz�n�z.");
		 
		 int yildiz=scanner.nextInt();
		 
		 for(int i=1;i<=yildiz;i++) {
			 System.out.print("*");
			 
			 if(i==yildiz) {
				 for(int j=1;j<=yildiz;j++) {
					 System.out.print("\n*");
				 }
			 }
		 }
	}
	
	public void cumledeArama() {
		
		 System.out.println("C�mle yaz�n�z.");
		 String cumle=scanner.nextLine();
		 
		 System.out.println("de�er aral���n� yaz�n�z.");
		 int ilkDeger=scanner.nextInt();
		 int sonDeger=scanner.nextInt();
		 
		 System.out.println(cumle.substring(ilkDeger, sonDeger));
	}

}

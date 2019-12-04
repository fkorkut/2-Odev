package com.uniyaz;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
       Scanner scanner=new Scanner(System.in);
       
       StringIslem stringislem=new StringIslem();
       SayisalIslemler sayisalIslemler=new SayisalIslemler();
       
       System.out.println("");
       
       while(true) {
    	   
    	   System.out.println("");
    	   System.out.println("1.iþlem : Cümle tersten yazýlsýn.");
    	   System.out.println("2.iþlem: Girilen sayi ile ters L þekli oluþturulsun.");
    	   System.out.println("3.iþlem : Cümlenin belli bir kýsmýný gösterilsin.");
    	   System.out.println("4.iþlem : Girilen sayýya kadar çift sayýlarý göster.");
    	   System.out.println("5.iþlem : Girilen sayýya kadar tek sayýlarý göster.");
    	   System.out.println("6.iþlem : Çýkýþ.");
    	   
    	   int yanit=scanner.nextInt();
    	   
    	   switch(yanit) {
    	   		case 1:
    	   		  stringislem.terstenYazdir();
    	   		  break;
    	   		case 2 :
      	   		  stringislem.testLYazdir();
      	   		  break;
    	   		case 3:
      	   		  stringislem.cumledeArama();
        	   	  break;
    	   		case 4:
    	   		  sayisalIslemler.ciftSayilariBul();
    	   		  break;
    	   		case 5:
    	   		  sayisalIslemler.tekSayilariBul();
    	   		  break;
    	   		case 6:
    	   			break;
    	   			
    	   }
       }
    }
}

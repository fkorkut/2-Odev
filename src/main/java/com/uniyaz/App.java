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
    	   System.out.println("1.i�lem : C�mle tersten yaz�ls�n.");
    	   System.out.println("2.i�lem: Girilen sayi ile ters L �ekli olu�turulsun.");
    	   System.out.println("3.i�lem : C�mlenin belli bir k�sm�n� g�sterilsin.");
    	   System.out.println("4.i�lem : Girilen say�ya kadar �ift say�lar� g�ster.");
    	   System.out.println("5.i�lem : Girilen say�ya kadar tek say�lar� g�ster.");
    	   System.out.println("6.i�lem : ��k��.");
    	   
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

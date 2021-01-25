//Skrivet av: Daniel Bjärby

//Datum: 21/01/18

//Beskrivning: Uppgift 1, del 2C. Rabattuträkning.

//**************************

import java.util.Scanner;
public class uppgiftC {


  public static void main(String[] args) {
	  int rabatt = 5;
	  Scanner in = new Scanner(System.in);

	  System.out.println("Din köpesumma minskas med rabatten " + rabatt+"kr");
	  System.out.print("Hur mycket har du handlat för? ");
	  System.out.println("Var god och ange ett tal över 10:  ");

	  int num1 = in.nextInt();
	  int num3 = num1 - rabatt;

	  System.out.println("Din rabatt är " + rabatt);
	  System.out.print("Du ska betala " + num1 + " - " +  rabatt  + " = " + num3+"kr");
	  in.close();

 }
}

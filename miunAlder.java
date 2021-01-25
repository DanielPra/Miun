//**************************

//Skrivet av: Daniel Bjärby

//Datum: 21/01/18

//Beskrivning: Uppgift 1, del 2C. Fråga efter och skriv ut användarens ålder.

//**************************

import java.util.Scanner;
public class miunAlder {


public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);

	  System.out.println("Hur gammal är du?: ");
	  int age = in.nextInt();

	  System.out.println("Du är " + age + " år gammal.");
	  in.close();

}
}

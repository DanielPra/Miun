//**************************

//Skrivet av: Daniel Bjärby

//Datum: 21/01/18

//Beskrivning: Uppgift 1, del 2D. Räkna ut arean av en triangel.

//**************************


import java.util.Scanner;
public class rektangel {
	public static void main(String[] args) {
	
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println("Var är längden på triangeln?: ");
	  double length = in.nextDouble();
	  
	  System.out.println("Var är bredden på triangeln?: ");
	  double width = in.nextDouble();
	  
	  double area = length * width;
	  
	  System.out.println("Arean av triangeln är " + area);
	  in.close();
 
 }
}

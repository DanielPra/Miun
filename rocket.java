//**************************

//Skrivet av: Daniel Bjärby

//Datum: 21/02/14

//Beskrivning: Uppgift 5, del 2. Vi skriver ut bilder efter användarens val

//**************************

import java.util.Scanner;

public class rocket {
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String userChoice;
			
			while (true) {
			  System.out.println("Vill du skriva ut en pojke, flicka eller en raket? Svara 'P', 'F' eller 'R' alt. 'Q' för att avsluta: ");
			  userChoice = in.next();
			  
			  System.out.print("Du valde: " + userChoice+".");
			  
			  if (userChoice.equals("R")) {
				  System.out.println("Hur många steg ska raketen ha?: ");
				  printRocket(in.nextInt());
			  }
			  else if (userChoice.equals("F")) {
				  printGirl();
			  }
			  else if (userChoice.equals("P")) {
				  printBoy();
			  }
			  else if (userChoice.equals("Q")) {
				  System.out.print(" Programmet avslutas");
				  in.close();
				  break;
			  }
			  else {System.out.println(" Fel input - försök igen.");
			  }
	}
			
	}
	
	static void printRocket(int rocketLength) { 
		  System.out.println("Vi skriver ut en raket: ");
		  drawCone();
      for (int i = 0; i < rocketLength; i++) {
    	  	drawBase(); 
		    drawParallel(); 
      }
		  drawBase();
		  drawCone();
		  
	  }	
	static void printGirl() { 
		  System.out.println("Vi skriver ut en flicka: ");
		  drawHead();
		  drawCone();
		  drawBase();
		  drawCone();	   
	  }	
	static void printBoy() { 
		  System.out.println("Vi skriver ut en pojke: ");
		  drawHead();
		  drawBase();
		  drawParallel();
		  drawBase();
		  drawCone();
	  }	
	static void drawBase() { 
		  System.out.println("======== ");
	  }	
	static void drawCone() { 
		  System.out.println("   /\\ ");
		  System.out.println("  /  \\ ");
		  System.out.println(" /    \\ ");
	  }	
	static void drawHead() { 
		  System.out.println("  //\\ ");
		  System.out.println(" |0,0|");
		  System.out.println("  \\v / ");
	  }	
	static void drawParallel() { 
		  System.out.println("|      | ");
		  System.out.println("|      | ");
		  System.out.println("|      | ");
	  }	
	
}

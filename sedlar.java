//**************************

//Skrivet av: Daniel Bjärby

//Datum: 21/01/19

//Beskrivning: Uppgift 2, del 2. Skriv ett program som skulle kunna användas av en butik 
//för att räkna ut hur mycket en kund ska få tillbaka i olika valörer

//**************************

import java.util.Scanner;
public class sedlar {

 
public static void main(String[] args) {
Scanner in = new Scanner(System.in);

int Hundralappar = 0, Femtiolappar = 0, Tjugor = 0, Tior = 0; 
int Femmor = 0, Enkronor = 0;
 
System.out.print("Vad kostar det?: ");
int kostnad = in.nextInt();

System.out.print("Hur mycket betalade kunden?: ");
int betalning = in.nextInt();

int tillbaka = betalning - kostnad;

if (tillbaka <= 0) {
	System.out.println("Du får ingen växel");
}

if (tillbaka >= 100) {
	Hundralappar = (tillbaka / 100);
	System.out.println("Antalet hundralappar du får tillbaka: " + Hundralappar);
	tillbaka = tillbaka % 100;
}

if (tillbaka >= 50) {
	Femtiolappar = (tillbaka / 50);
	System.out.println("Antalet femtiolappar du får tillbaka: " + Femtiolappar);
	tillbaka = tillbaka % 50;
}

if (tillbaka >= 20) {
	Tjugor = (tillbaka / 20);
	System.out.println("Antalet tjugor du får tillbaka: " + Tjugor);
	tillbaka = tillbaka % 20;
}

if (tillbaka >= 10) {
	Tior = (tillbaka / 10);
	System.out.println("Antalet tior du får tillbaka: " + Tior);
	tillbaka = tillbaka % 10;
}

if (tillbaka >= 5) {
	Femmor = (tillbaka / 5);
	System.out.println("Antalet femmor du får tillbaka: " + Femmor);
	tillbaka = tillbaka % 5;
}

if (tillbaka >= 1) {
	Enkronor = (tillbaka / 1);
	System.out.println("Antalet enkronor du får tillbaka: " + Enkronor);
	tillbaka = tillbaka % 1;
}


else {
	System.out.println("Nu är det ingen växel kvar");

}
	
in.close();

}
}



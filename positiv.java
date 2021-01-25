//**************************

//Skrivet av: Daniel Bjärby

//Datum: 25/01/17

//Beskrivning: Uppgift 3, del 2. Gör ett program som läser in ett okänt antal positiva heltal

//**************************


public class positivt {
	public static void main(String[] args) {
	int overhundred = 0; 
	int underhundra = 0;
	int exakthundra = 0;
	int totalsumma = 0;
	int summaunder = 0;
	int summaover = 0;
	int antalnummer = 0;
	
	int[] myNum = {10, 20, 30, 40, 500}; // Funkar inte med 50 som sista tal
	
	
	for (int i = 0; i < myNum.length; i++) {
	
		if (myNum[i] > 100) {
		totalsumma = totalsumma + myNum[i];
		summaover = summaover + myNum[i];
		overhundred++;
		antalnummer++;
		}
		
		if (myNum[i] < 100) {
			totalsumma = totalsumma + myNum[i];
			summaunder = summaunder + myNum[i];
			underhundra++;
			antalnummer++;
		}
		
		if (myNum[i] == 100) {
			totalsumma = totalsumma + myNum[i];
			exakthundra++;
			antalnummer++;
		}
	}
	
	
	//int averagehigh = summaover / overhundred; //overhundred = Divide by zero?
	//int averagelow = summaunder / underhundra;
	
	System.out.println("Det finns " + exakthundra + " som är exakt 100");
	System.out.println("Det finns " + overhundred + " tal över 100");
	System.out.println("Det finns " + underhundra + " tal under 100");
	System.out.println("Den totala summan är " + totalsumma);
	System.out.println("Den totala summan av talen över 100 är " + summaover);
	System.out.println("Den totala summan av talen under 100 är " + summaunder);
	System.out.println("Den totala antalet positiva tal i listan är " + antalnummer);
	
	if (overhundred > 0) {
		int averagehigh = summaover / overhundred; //overhundred
		System.out.println("Medelvärdet för talgrupperna över 100 är " + averagehigh);
	}
	if (underhundra > 0) {
		int averagelow = summaunder / underhundra;
	System.out.println("Medelvärdet för talgrupperna under 100 är " + averagelow);}
	
}
}


//int[] myNum = {100, 20, 30, 40, 50};

//for (int i = 0; i < myNum.length; i++) {
//if (myNum[i] >= 0) { System.out.println("Talet är >= 0");}

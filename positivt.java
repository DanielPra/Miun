/*  
1. Gör ett program som läser in ett okänt antal positiva heltal (när ett negativt värde anges
avslutas inmatningsmöjligheten).

2. Skriv sedan ut hur många angivna värden som är större än 100, 

3. Hur många som är mindre än 100, 

4. Samt hur många som är exakt 100. 

5. Skriv även ut hur många värden som totalt är angivet (det negativa värdet ska inte räknas med).

6. Skriv även ut medelvärdet för talgrupperna över 100 respektive under 100.

7. Testa programmet ett antal gånger med olika värden. Du ska bl.a. vid någon test se till att
alla värden är mindre än 100   */


public class positivt {
	public static void main(String[] args) {
	int overhundred = 0; 
	int underhundra = 0;
	int exakthundra = 0;
	int totalsumma = 0;
	int summaunder = 0;
	int summaover = 0;
	int antalnummer = 0;
	
	int[] myNum = {100, 20, 30, 400, 500};
		//int[] myNum = {100, 20, 30, 40, 50};
	
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
	
	int averagehigh = summaover / overhundred;
	int averagelow = summaunder / underhundra;
	
	System.out.println("Det finns " + exakthundra + " som är exakt 100");
	System.out.println("Det finns " + overhundred + " tal över 100");
	System.out.println("Det finns " + underhundra + " tal under 100");
	System.out.println("Den totala summan är " + totalsumma);
	System.out.println("Den totala summan av talen över 100 är " + summaover);
	System.out.println("Den totala summan av talen under 100 är " + summaunder);
	System.out.println("Den totala antalet positiva tal i listan är " + antalnummer);
	System.out.println("Medelvärdet för talgrupperna under 100 är " + averagelow);
	System.out.println("Medelvärdet för talgrupperna under 100 är " + averagehigh);
}
}

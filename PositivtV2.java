import java.util.Scanner;

public class PositivtV2 { 	
	public static void main(String[] args) {
	int overhundred = 0, underhundra = 0, exakthundra = 0,totalsumma = 0, summaunder = 0;
	int summaover = 0, antalnummer = 0;
	Scanner scan = new Scanner(System.in);
    
    while (true) {
    	System.out.println("Please input a number");
    	int input = scan.nextInt();
    	
    	if (input < 0) {
    		scan.close(); 
    		System.out.println("You input a negative integer. Ending the program");
    		break;
    	} 
    	else if (input == 100)  {
    		totalsumma = totalsumma + input;
			exakthundra++;
			antalnummer++;
    	}
    	else if (input > 100)  {
    		totalsumma = totalsumma + input;
			summaover = summaover + input;
			overhundred++;	
    	}
    	else if (input < 100)  {
    		totalsumma = totalsumma + input;
			summaunder = summaunder + input;
			underhundra++;
			antalnummer++;
    	}
    }
    System.out.println("Det finns " + exakthundra + " som är exakt 100");
	System.out.println("Det finns " + overhundred + " tal över 100");
	System.out.println("Det finns " + underhundra + " tal under 100");
	System.out.println("Den totala summan är " + totalsumma);
	System.out.println("Den totala summan av talen över 100 är " + summaover);
	System.out.println("Den totala summan av talen under 100 är " + summaunder);
	System.out.println("Den totala antalet positiva tal i listan är " + antalnummer);
	
	if (overhundred > 0) {
		int averagehigh = summaover / overhundred; 
		System.out.println("Medelvärdet för talgrupperna över 100 är " + averagehigh);
	}
	if (underhundra > 0) {
		int averagelow = summaunder / underhundra;
	System.out.println("Medelvärdet för talgrupperna under 100 är " + averagelow);}
   
		}
}
	

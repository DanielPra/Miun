import java.util.LinkedList;
import java.util.Scanner;

public class positivt {
	public static void main(String[] args) {
	int overhundred = 0; 
	int underhundra = 0;
	int exakthundra = 0;
	int totalsumma = 0;
	int summaunder = 0;
	int summaover = 0;
	int antalnummer = 0;
	
    LinkedList<Integer> nums = new LinkedList<Integer>();  
    Scanner scan = new Scanner(System.in);
    
    while (true) {
    	System.out.println("Input number");
    	String s = scan.nextLine();
    	int i = Integer.parseInt(s); 

    	if (i < 0) {
    		break;
    	} else {
    		nums.add(i);
    }
  }

scan.close();

Integer[] myArray = nums.toArray(new Integer[nums.size()]);
	for (int i = 0; i < myArray.length; i++) {
		if (myArray[i] > 100) {
		totalsumma = totalsumma + myArray[i];
		summaover = summaover + myArray[i];
		overhundred++;
		antalnummer++;
		}
		
		if (myArray[i] < 100) {
			totalsumma = totalsumma + myArray[i];
			summaunder = summaunder + myArray[i];
			underhundra++;
			antalnummer++;
		}
		
		if (myArray[i] == 100) {
			totalsumma = totalsumma + myArray[i];
			exakthundra++;
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
		int averagehigh = summaover / overhundred; //overhundred
		System.out.println("Medelvärdet för talgrupperna över 100 är " + averagehigh);
	}
	if (underhundra > 0) {
		int averagelow = summaunder / underhundra;
	System.out.println("Medelvärdet för talgrupperna under 100 är " + averagelow);}
	
}
}


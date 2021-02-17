//**************************

//Skrivet av: Daniel Bjärby

//Datum: 21/02/17

//Beskrivning: Uppgift 6. Läs in 20 tal från tangentbordetoch sortera dem.

//**************************

import java.util.Scanner;

public class MiunArray {
	public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);
		System.out.println("How long do you want the array to be");
		int len = myScanner.nextInt();
		int[] minArray = new int[len];
		System.out.println("Please enter the numbers for the array");
		
		for(int i=0; i<len; i++) {
			minArray[i] = myScanner.nextInt();
		}
		myScanner.close();
		
		int total = 0;
		int smallest = minArray[0];
		int largest = minArray[0];
		for (int i=0; i<minArray.length; i++) {
			total = total + minArray[i];
			
			if (minArray[i] < smallest)  {
				smallest = minArray[i];
			}			
			if (minArray[i] > largest) {
				largest = minArray[i];
			}	
		}
    for (int row = 0; row < minArray.length; row += 5) {
      for (int col = 0; col < 5; col ++) {
        System.out.print(minArray[row+col]);
        System.out.print(" ");
      }
      System.out.println("");
    }
		System.out.println("The total sum of the array is " + total);
		System.out.println("The average of the array is " + total / minArray.length);
		System.out.println("The smallest number is " + smallest);
		System.out.println("The largest number is " + largest);		
	}	
}

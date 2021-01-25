//**************************

//Skrivet av: Daniel Bjärby

//Datum: 21/01/17

//Beskrivning: Uppgift 1, del 2a. Vi frågar efter två tal och adderar dem.

//**************************


import java.util.Scanner;
public class heltal {

    
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input the 1st number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input the 2nd number: ");
  int num2 = in.nextInt();
  
  int num3 = num1 + num2;
   
  System.out.println(num1 + " + " + num2 + " is: " + num3);
  in.close();
 
 }
}

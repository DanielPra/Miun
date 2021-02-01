import java.util.Scanner;

public class bensin {
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		  
		  System.out.println("Vad är antalet liter?");
		  float liter = in.nextInt();

		  System.out.println("Vad är antalet kilometer? ");
		  float km = in.nextInt();
		  
		  System.out.println("Vill du ha svaret enligt EU- eller US-standard? Svara 'E' eller 'U' ");
		  String unit = in.next();
		  in.close();
		  
		  if (unit.equals("E")) {
			  myMethod(liter, km);
		  }
		  else {
			  inGallons(liter, km);
		  }
	 }
	
	static void myMethod(float liter, float km) { 
		  float hundredKM = ((liter / km) * 100);
		  System.out.println("Förbrukningen i liter per 100 km är: " + hundredKM);
	  }	
	
	static void inGallons(float liter, float km) { 
		float miles = (float) (km / 1.609);
		float gallons = (float) (liter * 0.264172);
		float mperGallon = miles / gallons;
		System.out.println("Förbrukningen i gallons per 1 mile är: " + mperGallon);
	  }	
}


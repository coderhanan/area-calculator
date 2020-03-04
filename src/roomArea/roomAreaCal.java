package roomArea;

import java.util.Scanner;

public class roomAreaCal {

	public static void main(String[] args) {
		
		//asking user for room length and validates to make sure its a positive value
		
		Scanner userL = new Scanner (System.in);
		System.out.println("Please enter room length");
		
		float roomL = userL.nextFloat();
		
		while (roomL<=0) {
			System.out.println("Please enter a positive value");
			roomL = userL.nextFloat();
		}
		
		//asking user for room width and validates to make sure its a positive value
		
		Scanner userW = new Scanner (System.in);
		System.out.println("Please enter room width");
		
		float roomW = userW.nextFloat();
		
		while (roomW<=0) {
			System.out.println("Please enter a positive value");
			roomW = userW.nextFloat();
		}
		
		//calculating room area
		double areaF = roomL * roomW;
		double areaM = areaF * 0.09290304;
		
		//display area
		System.out.println("Area for your room in feets sqaure is "+ areaF);
		System.out.println("Area for your room in meters sqaure is "+ areaM);
		
	}

}

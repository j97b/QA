package main;

import java.text.DecimalFormat;

public class results {

	static int physics = 90;
	static int chemistry = 100;
	static int biology = 100;
	static int total = physics + chemistry + biology;
	static float percentage = (float) total * 100 / 450;
	static boolean fail = false;
	static int physicsPercent = physics * 100 / 150;
	static int chemistryPercent = chemistry * 100 / 150;
	static int biologyPercent = biology * 100 / 150;
	static boolean failPhysics = physicsPercent < 60;
	static boolean failChemistry = chemistryPercent < 60;
	static boolean failBiology = biologyPercent < 60;
	

	static void displayMarks(int physics, int chemistry, int biology) {

		System.out.println("Your Physics mark is: " + physics + "/150.  (" + physicsPercent + "%)");
		System.out.println("Your Chemistry mark is: " + chemistry + "/150.  (" + chemistryPercent + "%)");
		System.out.println("Your Biology mark is: " + biology + "/150.  (" + biologyPercent + "%)");
		System.out.println("\nIn total, you scored: " + total + "/450.");

	}

	static void displayPercentage(int physics, int chemistry, int biology) {

		System.out.println("This gives a percentage of: " + percentage + "%");

	}

	static void displayFail(int physics, int chemistry, int biology) {

		if (percentage < 60 || failPhysics || failChemistry || failBiology) {

			System.out.println("\nUnfortunately, you failed :(");
			fail = true;

		}
	}

	static void displayFailReason(int physics, int chemistry, int biology) {
		
		
		if (fail == true) {
			
			if (percentage < 60) {
				
				System.out.println("Your total percentage is less than 60%");
				
			} else if (failPhysics && failChemistry) {
				
				System.out.println("Your physics and chemistry percentages are below 60%");
				
			} else if (failPhysics && failBiology) {
				
				System.out.println("Your physics and biology percentages are below 60%");
				
			} else if (failChemistry && failBiology) {
				
				System.out.println("Your chemistry and biology percentages are below 60%"); 
			
			} else if (failPhysics) {
				
				System.out.println("Your physics percentage is below 60%");
				
			} else if (failChemistry) {
				
				System.out.println("Your chemistry percentage is below 60%");
			
			} else if (failBiology) {
				
				System.out.println("Your biology percentage is below 60%");
				
			}
		} else { 
			
			System.out.println("\nCongratulations, you passed!");
			
		}
		
		
		
	}

	public static void main(String[] args) {
		displayMarks(physics, chemistry, biology);
		displayPercentage(physics, chemistry, biology);
		displayFail(physics, chemistry, biology);
		displayFailReason(physics, chemistry, biology);
	}

}

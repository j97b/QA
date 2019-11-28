package main;

import java.util.ArrayList;
import java.util.List;

public class Hobbies {
	
	static String[] jamesHobbies = { "Climbing", "Running", "Cycling", "Spyro", "Watching films"};
	static String[] bekkiHobbies = {"Watching football", "Playing sims", "Watching tv", "Baking"};
	static String[] ewanHobbies = {"Gymnastics","Skateboarding","Playing Guitar","Music","programming"};
	static String[] neevenHobbies = {"Gaming","Football","Comic books"};
	static String[] lukeHobbies =  {"Gaming", "Formula 1", "Football", "(Bad at)Golf" };
	static String[] harrisHobbies = {"Parkour", "Drawing", "Running", "Cycling", "Bouldering", "Python", "Gaming"};
	 
	static String[][] allHobbies = {jamesHobbies, bekkiHobbies,ewanHobbies, neevenHobbies, lukeHobbies, harrisHobbies};
	
	


	public static void main(String[] args) {
		
		for (String[] a : allHobbies) {
			for (String b : a) {
				System.out.print(b + ", ");
			}
			System.out.println();
		}
		
	}

}

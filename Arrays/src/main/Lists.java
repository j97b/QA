package main;

import java.util.ArrayList;

public class Lists {
	
	static ArrayList<String> bHobbies = new ArrayList<>();

	

	public static void main(String[] args) {

		bHobbies.add("Watching football");
		bHobbies.add("Playing sims");
		bHobbies.add("Watching tv");
		bHobbies.add("Baking");

		System.out.println(bHobbies);
		for (String a : bHobbies) {
			System.out.println(a);
		}

	}

}

package com.qa.bae.restaurant;

public class Suggestor {

	String foodType;
	String restaurant;

	public String faveFood(String faveFood) {

		switch (faveFood) {
		case "Pasta":
			foodType = "Italian";
			restaurant = "Jist Misto";
			return getQuestion();
		case "Burgers":
			foodType = "American";
			restaurant = "Buck's Bar";
			return getQuestion();
		case "Tacos":
			foodType = "Mexican";
			restaurant = "Topolabamba";
			return getQuestion();
		case "Curry":
			foodType = "Indian";
			restaurant = "Koolba";
			return getQuestion();
		default:
			return "There are no recommendations for you in our current database. Would you like to enter another food?";

		}
	}

	private String getQuestion() {
		return "Is your favourite food " + foodType + "? (Type 'Yes' for yes, or anything else for no): ";
	}

	public String likes(String likes) {
		String suggestion = "The best " + foodType + " restaurant in Glasgow is " + restaurant;
		if (!likes.equals("Yes")) {
			suggestion = "Please enter a different food";
			return suggestion;
		}
		return suggestion;
	}

}

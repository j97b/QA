package com.qa.bae.restaurant;

import org.junit.Assert;
import org.junit.Test;



public class RestaurantTest {

	@Test
	public void testItalian() {
		Suggestor sug = new Suggestor();
		String likesPasta = sug.faveFood("Pasta");
		Assert.assertEquals("Is your favourite food Italian?  (Type 'Yes' for yes, or anything for no): ", likesPasta);
		
		String likesItalian = sug.likes("Yes");
		Assert.assertEquals("The best Italian restaurant in Glasgow is Jist Misto", likesItalian);
		
		String dislikesItalian = sug.likes("No");
		Assert.assertEquals("Please enter a different food", dislikesItalian);
	}
	@Test
	public void testAmerican() {
		Suggestor sug = new Suggestor();
		String likesBurgers = sug.faveFood("Burgers");
		Assert.assertEquals("Is your favourite food American?  (Type 'Yes' for yes, or anything for no): ", likesBurgers);
		
		String likesAmerican = sug.likes("Yes");
		Assert.assertEquals("The best American restaurant in Glasgow is Buck's Bar", likesAmerican);
		
		String dislikesAmerican = sug.likes("No");
		Assert.assertEquals("Please enter a different food", dislikesAmerican);
	}
	@Test
	public void testMexican() {
		Suggestor sug = new Suggestor();
		String likesTacos = sug.faveFood("Tacos");
		Assert.assertEquals("Is your favourite food Mexican?  (Type 'Yes' for yes, or anything for no): ", likesTacos);
		
		String likesMexican = sug.likes("Yes");
		Assert.assertEquals("The best Mexican restaurant in Glasgow is Topolobamba", likesMexican);
		
		String dislikesMexican = sug.likes("No");
		Assert.assertEquals("Please enter a different food", dislikesMexican);
	}
	@Test
	public void testIndian() {
		Suggestor sug = new Suggestor();
		String likesCurry = sug.faveFood("Curry");
		Assert.assertEquals("Is your favourite food Indian?  (Type 'Yes' for yes, or anything for no): ", likesCurry);
		
		String likesIndian = sug.likes("Yes");
		Assert.assertEquals("The best Indian restaurant in Glasgow is Koolba", likesIndian);
		
		String dislikesIndian = sug.likes("No");
		Assert.assertEquals("Please enter a different food", dislikesIndian);
	}
	@Test
	public void testOther() {
		Suggestor sug = new Suggestor();
		String likesOther = sug.faveFood("Fish and Chips");
		Assert.assertEquals("There are no recommendations for you in our current database. Would you like to enter another food?", likesOther);
		
		String retry = sug.retry("Yes");
		Assert.assertEquals("Restart application", retry);
		
		String terminate = sug.retry("No");
		Assert.assertEquals("Have a nice day!", terminate);
	}


}

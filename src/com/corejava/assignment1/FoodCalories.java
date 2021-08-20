/*
 * Author: Rahul Giri
 * Created on: 18th August 2021
 * Description: Here required variables are declared.
 */

package com.corejava.assignment1;

public class FoodCalories {
	
	private String foodName;
	
	private double fatGram=0;
	private double  totalCalories=0;

	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	public double getFatGram() {
		return fatGram;
	}
	public void setFatGram(double fatGram) {
		this.fatGram = fatGram;
	}
	public double getTotalCalories() {
		return totalCalories;
	}
	public void setTotalCalories(double totalCalories) {
		this.totalCalories = totalCalories;
	}
	
	
	
	
	
}

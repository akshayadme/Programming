/*
 * Author: Rahul Giri
 * Created on: 18th August 2021
 */

package com.corejava.assignment1;

import java.util.Scanner;

public class FoodItems extends FoodCalories {

	public void fatCalPercent() {
		String foodName;
		double fatGrams;
		double totalCal;
		double fatCalories;
		double fatCaloriesPercent;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of a food item: ");
		foodName = sc.next();
		setFoodName(foodName);
		System.out.println("Enter the grams of fat: ");
		
		try {
		fatGrams = sc.nextDouble();
		setFatGram(fatGrams);
		System.out.println("Enter the number of TotalCalories: ");
		totalCal = sc.nextDouble();
		setTotalCalories(totalCal);

		fatCalories = 9 * fatGrams;
		fatCaloriesPercent = (fatCalories * 100) / totalCal;

		if (fatCalories > totalCal) {
			System.out.println("Invalid Input of grams of fat");
		}

		else {
			System.out.println(getFoodName() + " has " + fatCaloriesPercent + " % of Calories from fat");
			if (fatCalories < (0.3 * getTotalCalories())) {
				System.out.println("This item is Heart Heathy!");
			} else
				System.out.println("This item is NOT Heart Heathy!");
		}

	}
		
		catch(Exception e){
			
			System.out.println("Invalid Input type! Integer value is expected");
		}
		
		finally {
			sc.close();
		}
	}
	
	

}

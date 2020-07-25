package com.task5.epam_task5;

public class HouseEstimationCost 
{
		//Method to calculate the estimated house construction cost for a fully automated house
		public float fullyAutomatedHome(float total_area_of_house)
		{
			float amount;
			amount=2500*total_area_of_house;
			return amount;
		}
		//Method to calculate the estimated house construction cost for a non-automated house
		public float Home(float total_area_of_house,int cost_per_square_feet)
		{
			float amount;
			amount=cost_per_square_feet*total_area_of_house;
			return amount;
		}

}

package com.task5.epam_task5;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InputMainForConstructionMaterials 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	private static Scanner sc;
	private static int type,option,continue_option;
	private static float total_area_of_house,estimate_amount;	 
	public static void main( String[] args )
    {
		//method to call the 
		houseConstruction();
    }
	
	private static void houseConstruction() {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		HouseEstimationCost obj=new HouseEstimationCost(); 
		LOGGER.info("---Please enter total area of the house(in square feet)---");
		total_area_of_house = sc.nextFloat();
		LOGGER.info("---Enter 1 if you opt for a fully automated house otherwise enter 0---");
		type=sc.nextInt();//option to check for a fully automated house
		if(type==1)
		{
			estimate_amount=obj.fullyAutomatedHome(total_area_of_house);
			LOGGER.info("Your estimated house construction cost is Rs."+estimate_amount);
			LOGGER.info("Do you want to continue?\nenter 1 to continue otherwise enter 0");
			continue_option=sc.nextInt();
			if(continue_option==1)
				houseConstruction();
			else
				LOGGER.info("Thank you");
		}
		else if(type==0)
		{
			LOGGER.info("---PLease select an option for the type of material to be used for construction---");
			LOGGER.info("---Enter 1 for standard materials---");
			LOGGER.info("---Enter 2 for above standard materials---");
			LOGGER.info("---Enter 3 for high standard material---");
			option=sc.nextInt();//option to check for a non-automated house
			if(option==1)
			{
				estimate_amount=obj.Home(total_area_of_house,1200);
				LOGGER.info("Your estimated house construction cost is Rs."+estimate_amount);
				LOGGER.info("Do you want to continue?\\nenter 1 to continue otherwise enter 0");
				continue_option=sc.nextInt();
				if(continue_option==1)
					houseConstruction();
				else
					LOGGER.info("Thank you");
			}
			else if(option==2)
			{
				estimate_amount=obj.Home(total_area_of_house,1500);
				LOGGER.info("Your estimated house construction cost is Rs."+estimate_amount);
				LOGGER.info("Do you want to continue?\nenter 1 to continue otherwise enter 0");
				continue_option=sc.nextInt();
				if(continue_option==1)
					houseConstruction();
				else
					LOGGER.info("Thank you");
			}
			else if(option==3)
			{
				estimate_amount=obj.Home(total_area_of_house,1800);
				LOGGER.info("Your estimated house construction cost is Rs."+estimate_amount);
				LOGGER.info("Do you want to continue?\\nenter 1 to continue otherwise enter 0");
				continue_option=sc.nextInt();
				if(continue_option==1)
					houseConstruction();
				else
					LOGGER.info("Thank you");
			}
		}
		
	}
	
}

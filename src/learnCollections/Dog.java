package learnCollections;

import java.awt.Color;

public class Dog {
	
	Color dogColor;
	String breedType;
	String dogGender;
	
	public void bark()
	
	{
		System.out.println("The Dog Barks");
		
	}
	
	public void setColor(Color getdogColor)
	
	{
		this.dogColor = getdogColor;
		System.out.println("The Dog Color is:" +dogColor);

		
	}
	
	public void setbreedType(String getbreedType)
	
	{
		this.breedType = getbreedType;
		System.out.println("The Dog BreeedTyper is:" +breedType);

		
	}
	
	public void setdogGender(String getdogGender)
	
	{
		this.dogGender = getdogGender;
		System.out.println("The Dog dogGender is:" +dogGender);

		
	}
	
	

}

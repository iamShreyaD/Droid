/*
 * Shreya B Deshpande
 * This project is done through the course of codecademy "Learn: java"
 * A robot workshop has been set up to build some droids. The instructions are created to guide how to create robots and what they will do.
 */
public class Droid
{
	int batteryLevel;
	String name;
	
	// constructor Droid
	public Droid(String droidName)
	{
		name = droidName;
		batteryLevel = 100;
	}
	
	// method to print information in the constructor
	public String toString()
	{
		return "Hello, I'm the droid: " + name;
	}
	
	// method to print tasks performed
	public void performTask(String task) 
	{
		System.out.println(name + " is performing task: " + task);
		batteryLevel -= 10;
	} 
	
	// method to print total energy consumed
	public void energyReport()
	{
		System.out.println(batteryLevel);
	}
	
	public static void main(String[] args)
	{
		 Droid droid = new Droid("Codey");
		 System.out.println(droid);
		 droid.performTask("dancing");
		 droid.performTask("singing");
		 droid.energyReport();
	}
	  
}
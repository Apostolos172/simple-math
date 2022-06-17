package MathOfLife;

public class Percentages {
	
	public static double removeFromPercentage(double value, double percentage)
	{
		double amountOfPercentage = value*percentage/100;
		double finalValue = value-amountOfPercentage;
		return finalValue;
	}
	
	public static double addFromPercentage(double value, double percentage)
	{
		double amountOfPercentage = value*percentage/100;
		double finalValue = value+amountOfPercentage;
		return finalValue;
	}
	
	public static double getTheAmountOfThePercentage(double value, double percentage)
	{
		return value*percentage/100.0;
	}
}

package MathOfLife;

public class InitialPrices {
	
	public static double helpful()
	{
		return 1.24;
	}
	
	public static double getInitialPriceRemovingFPA(double finalPrice, double percentageOfFPA)
	{
		return finalPrice / 1.24;
	}
}

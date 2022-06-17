package MathOfLife;

import java.util.ArrayList;

public class FinalPrices {
	
	public static double getFinalPrice(double initialPrice, double percentageOfProfit, 
			double percentageOfFPA)
	{
		double profit = initialPrice*percentageOfProfit/100;
		double initialPriceWithProfit = initialPrice + profit;
		double FPA = initialPriceWithProfit*percentageOfFPA/100;
		double finalPrice = initialPriceWithProfit + FPA;
		
		return finalPrice;
	}
	
	public static double getFinalPriceHavingDiscount(double initialPrice, double percentageOfDiscountSupplier,
			double percentageOfProfit, double percentageOfFPA )
	{
		double discountSupplier = initialPrice*percentageOfDiscountSupplier/100;
		double initialPriceWithoutTheAmountOfDiscountSupplier = initialPrice-discountSupplier;
		double finalPrice = FinalPrices.getFinalPrice(initialPriceWithoutTheAmountOfDiscountSupplier, percentageOfProfit, percentageOfFPA);
		return finalPrice;
	}
	
	public static double getFinalPriceHavingMultipleDiscounts(double initialPrice, 
			ArrayList<Double> percentagesOfDiscountSupplier,
			double percentageOfProfit, double percentageOfFPA )
	{
		double previousValue = initialPrice;
		for(Double percentageOfDiscount: percentagesOfDiscountSupplier)
		{
			double discountSupplier = previousValue*percentageOfDiscount/100;
			previousValue = previousValue-discountSupplier;
		}
		double finalPrice = FinalPrices.getFinalPrice(previousValue, percentageOfProfit, percentageOfFPA);
		return finalPrice;
	}
	
	public static double getPriceWithoutDiscounts(double initialPrice, 
			ArrayList<Double> percentagesOfDiscountSupplier)
	{
		double previousValue = initialPrice;
		for(Double percentageOfDiscount: percentagesOfDiscountSupplier)
		{
			previousValue = Percentages.removeFromPercentage(previousValue, percentageOfDiscount);
		}
		return previousValue;
	}
	
	public static double getFinalPriceHavingFare(double initialPrice, ArrayList<Double> percentagesOfDiscountSupplier,
			double percentageOfFare, double percentageOfProfit, double percentageOfFPA )
	{
		double tempPrice = FinalPrices.getPriceWithoutDiscounts(initialPrice, percentagesOfDiscountSupplier);
		tempPrice = Percentages.addFromPercentage(tempPrice, percentageOfFare);
		tempPrice = Percentages.addFromPercentage(tempPrice, percentageOfProfit);
		tempPrice = Percentages.addFromPercentage(tempPrice, percentageOfFPA);
		return tempPrice;
	}
	
	public static double addPrices(ArrayList<Double> prices)
	{
		double sum=0;
		for(Double price: prices)
		{
			sum+=price;
		}
		return sum;
	}

}

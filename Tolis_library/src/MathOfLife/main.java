package MathOfLife;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		// for testing purposes
		testLibrary();
	}

	private static void testLibrary() {
		ArrayList<Double> percentages = new ArrayList<Double>();
		percentages.add(50.0);
		percentages.add(6.0);
		double price = FinalPrices.getFinalPriceHavingMultipleDiscounts(10, percentages, 30, 24);
		System.out.println(round4decimals(price));
	}

	private static double round4decimals(double price) {
		// TODO Auto-generated method stub
		
		return Math.round(price*10000.0)/10000.0;
	}

}

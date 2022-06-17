package MathOfLife;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<Double> percentages = new ArrayList<>();
		percentages.add(50.0);
		percentages.add(6.0);
		double price = FinalPrices.getFinalPriceHavingMultipleDiscounts(10, percentages, 30, 24);
		System.out.println(price);
	}

}

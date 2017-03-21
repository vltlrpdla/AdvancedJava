package com.advancedjava.lunchpay;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LunchMenu child1 = new Child1(PriceTable.RICE,PriceTable.BULGOGI,PriceTable.BANANA,PriceTable.MILK,PriceTable.ALMOND);
		LunchMenu child2 = new Child2(PriceTable.RICE,PriceTable.BULGOGI,PriceTable.BANANA,PriceTable.MILK,PriceTable.ALMOND);

		System.out.println("child1 아이의 식대" + child1.calculating());
		System.out.println("child2 아이의 식대" + child2.calculating());
	}

}

package com.Interface;

public class Credit_Card implements Payment{

	@Override
	public void Paying(int amount) {
		System.out.println("paying through the credit card the amount is :"+ amount);
		System.out.println("Paying after the discount is "+(amount-0.02));
		
	}
}
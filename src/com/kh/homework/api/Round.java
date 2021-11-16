package com.kh.homework.api;

public class Round {

	public static void main(String[] args) {

		double num1 = 13.44;
		double num2 = 2.44;
		
		System.out.println(Math.round(((num1) + num2)*100.0)/100.0);
		System.out.println(Math.round(((num1) - num2)*100.0)/100.0);
		System.out.println(Math.round(((num1) * num2)*100.0)/100.0);
		System.out.println(Math.round(((num1) / num2)*100.0)/100.0);
	}

}

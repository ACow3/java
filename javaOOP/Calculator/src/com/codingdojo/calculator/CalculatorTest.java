package com.codingdojo.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c1 = new Calculator(0.5,"+",99.5);
		Calculator c2 = new Calculator(60.0,"-",10.0);
		Calculator c3 = new Calculator(500.0,"+",500.0);
		
		c1.performOperation();
		c2.performOperation();
		c3.performOperation();
		c1.getResults();
		c2.getResults();
		c3.getResults();
	}

}
package com.example.demo.secondo.decorator;

import com.example.demo.secondo.entities.Pizza;

public class SizeDecorator extends Pizza {
	public SizeDecorator(Pizza pizza) {
		super(pizza.getName() + " + Formato Maxi", pizza.getPrice() + 4.15, pizza.getCalorie() * 1.95);
	}
}

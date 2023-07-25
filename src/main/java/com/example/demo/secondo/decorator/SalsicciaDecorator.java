package com.example.demo.secondo.decorator;

import com.example.demo.secondo.entities.Pizza;

public class SalsicciaDecorator  extends Pizza {
	public SalsicciaDecorator(Pizza pizza) {
		super(pizza.getName() + " + salsiccia", pizza.getPrice() + 1.5, pizza.getCalorie() + 40);
	}
}

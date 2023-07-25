package com.example.demo.secondo.decorator;

import com.example.demo.secondo.entities.Pizza;

public class CrudoDecorator extends Pizza {
	public CrudoDecorator(Pizza pizza) {
		super(pizza.getName() + " + prosciutto crudo", pizza.getPrice() + 2, pizza.getCalorie() + 20);
	}
}

package com.example.demo.secondo.decorator;

import com.example.demo.secondo.entities.Ingredienti;
import com.example.demo.secondo.entities.Pizza;

public class IngredienteDecorator extends Pizza {
	public IngredienteDecorator(Pizza pizza, Ingredienti ingrediente) {
		super(pizza.getName() + " + " + ingrediente.getName(), pizza.getPrice() + ingrediente.getPrice(),
				pizza.getCalorie() + ingrediente.getCalorie());
	}
}

package com.example.demo.secondo.entities;

public class Ingredienti extends Edibile {

	public Ingredienti(String name, double price, double calorie) {
		super(name, price, calorie);
	}

	@Override
	public String toString() {
		return "Ingredienti [Nome = " + getName() + ", Calorie = " + getCalorie() + ", Prezzo = " + getPrice() + "€]";
	}
}

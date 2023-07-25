package com.example.demo.secondo.entities;

public class Bevande extends Edibile{

	public Bevande(String name, double price, double calorie) {
		super(name, price, calorie);
	}

	@Override
	public String toString() {
		return "Bevande [Nome = " + getName() + ", Calorie = " + getCalorie() + ", Prezzo = " + getPrice() + "€]";
	}
}

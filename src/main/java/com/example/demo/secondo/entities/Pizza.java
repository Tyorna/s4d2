package com.example.demo.secondo.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Pizza extends Edibile {

	public Pizza(String name, double price, double calorie) {
		super(name, price, calorie);
	}

	@Override
	public String toString() {
		return "Pizza [Nome = " + getName() + ", Calorie = " + getCalorie() + ", Prezzo = " + getPrice() + "€]";
	}
}

package com.example.demo.secondo.entities;

public class Merce extends Menu {

	public Merce(String name, double price) {
		super(name, price);
	}

	@Override
	public String toString() {
		return "Oggettistica [Nome = " + getName() + ", Prezzo = " + getPrice() + "€]";
	}
}

package com.example.demo.secondo.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Edibile extends Menu {
	private double calorie;
	public Edibile(String name, double price, double calorie) {
		super(name, price);
		this.setCalorie(calorie);
	}
}

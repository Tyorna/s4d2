package com.example.demo.secondo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.secondo.decorator.CrudoDecorator;
import com.example.demo.secondo.decorator.IngredienteDecorator;
import com.example.demo.secondo.decorator.PeperoniDecorator;
import com.example.demo.secondo.decorator.SalsicciaDecorator;
import com.example.demo.secondo.decorator.SizeDecorator;
import com.example.demo.secondo.entities.Bevande;
import com.example.demo.secondo.entities.Ingredienti;
import com.example.demo.secondo.entities.Merce;
import com.example.demo.secondo.entities.Pizza;
import com.example.demo.secondo.entities.PizzaMargherita;

@Configuration
public class BeansConf {

		@Bean
		Pizza pizzaMargherita() {
			return new PizzaMargherita();
		}

		@Bean
		Pizza pizzaCrudo() {
			return new CrudoDecorator(new PizzaMargherita());
		}

		@Bean
		Pizza pizzaMaialona() {
			SalsicciaDecorator maialona = new SalsicciaDecorator(
					new PeperoniDecorator(new CrudoDecorator(new PizzaMargherita())));
			maialona.setName("Pizza Maialona (Salsiccia, Prosciutto Crudo, Peperoni)");
			return maialona;
		}

		@Bean
		Pizza AllIn() {
			PeperoniDecorator allIn = new PeperoniDecorator(
					new SalsicciaDecorator(new CrudoDecorator(new PizzaMargherita())));
			allIn.setName("Pizza con tutti gli ingredienti");
			return allIn;
		}

		@Bean
		Pizza pizzaSalsicciaEPeperoni() {
			return new SalsicciaDecorator(new PeperoniDecorator(new PizzaMargherita()));
		}

		@Bean
		Pizza pizzaMaxi() {
			return new SizeDecorator(new PizzaMargherita());
		}

		@Bean
		Pizza pizzaMaialonaMaxi() {
			return new SizeDecorator(pizzaMaialona());
		}

		@Bean
		Pizza pizzaCustom() {
			return new IngredienteDecorator(new PizzaMargherita(), salsiccia());
		}

		// INGREDIENTI
		@Bean
		Ingredienti peperoni() {
			return new Ingredienti("Peperoni", 1.5, 30);
		}

		@Bean
		Ingredienti prosciuttoCrudo() {
			return new Ingredienti("Prosciutto Crudo", 2, 20);
		}

		@Bean
		Ingredienti salsiccia() {
			return new Ingredienti("Salsiccia", 1.5, 40);
		}

		// BEVANDE
		@Bean
		Bevande birra() {
			return new Bevande("Birra", 3.5, 200);
		}

		@Bean
		Bevande acqua() {
			return new Bevande("Acqua", 1, 0);
		}

		@Bean
		Bevande coca() {
			return new Bevande("Coca Cola", 2, 300);
		}

		@Bean
		Merce maglietta() {
			return new Merce("Maglietta", 1000);
		}

		@Bean
		Merce portachiavi() {
			return new Merce("portachiavi", 15);
		}
}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class NuovoesercizioApplication {

	public static void main(String[] args) {
		SpringApplication.run(NuovoesercizioApplication.class, args);
	es1();
	esercizio2();
	}
		public static void es1() {
		log.info("Ciao Mondo");
		}

	//Es 2

		public static void esercizio2() {
			AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
					NuovoesercizioApplication.class);

			log.info("*****PIZZE*****");
			log.info(ctx.getBean("pizzaMargherita").toString());
			log.info(ctx.getBean("pizzaMaialona").toString());
			log.info(ctx.getBean("AllIn").toString());
			log.info(ctx.getBean("pizzaCrudo").toString());
			log.info(ctx.getBean("pizzaSalsicciaEPeperoni").toString());
			log.info(ctx.getBean("pizzaMaxi").toString());
			log.info(ctx.getBean("pizzaMaialonaMaxi").toString());
			log.info(ctx.getBean("pizzaCustom").toString());
			log.info("*****FORMATO MAXI*****");
			log.info("Pizza Maxi [Calorie = * 1.95, Prezzo = +4.15€]");
			log.info("*****INGREDIENTI EXTRA*****");
			log.info(ctx.getBean("prosciuttoCrudo").toString());
			log.info(ctx.getBean("salsiccia").toString());
			log.info(ctx.getBean("peperoni").toString());
			log.info("*****BEVANDE*****");
			log.info(ctx.getBean("birra").toString());
			log.info(ctx.getBean("coca").toString());
			log.info(ctx.getBean("acqua").toString());
			log.info("*****OGGETTISTICA*****");
			log.info(ctx.getBean("maglietta").toString());
			log.info(ctx.getBean("portachiavi").toString());
			ctx.close();
		}

	}

package cup.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cup.beans.CoffeeDrinks;

/**
 * @author torirem - aaustin5
 * CIS175 - Fall 2023
 * Oct 16, 2023
 */
@Configuration
public class BeanConfig {
	@Bean
	public CoffeeDrinks coffeedrinks() {
		CoffeeDrinks bean = new CoffeeDrinks();
		bean.setName("Iced Machiatto");
		bean.setMilkType("Steamed");
		bean.setNumShots(2);
		bean.setIsIced(true);
		return bean;
	}
	

}

package cup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import cup.beans.CoffeeDrinks;
import cup.controller.BeanConfig;
import cup.repository.CoffeeDrinksRepository;

@SpringBootApplication
public class SpringCoffeeApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringCoffeeApplication.class, args);
		
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfig.class);
//		
//		CoffeeDrinks cd = appContext.getBean("coffeedrinks", CoffeeDrinks.class);
//		
//		System.out.println(cd.toString());
	}
	
//	@Autowired
//	CoffeeDrinksRepository repo;
//
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfig.class);
//		
//		CoffeeDrinks cd = appContext.getBean("coffeedrinks", CoffeeDrinks.class);
//		cd.setNumShots(3);
//		repo.save(cd);
//		
//		CoffeeDrinks cappuccino = new CoffeeDrinks("Cappuccino", 1, "foam and steamed");
//		cappuccino.setIced(false);
//		repo.save(cappuccino);
//		
//		List<CoffeeDrinks> allDrinks = repo.findAll();
//		for (CoffeeDrinks drink: allDrinks) {
//			System.out.println(drink.toString());
//		}
//		
//		((AbstractApplicationContext) appContext).close();
//	}

}

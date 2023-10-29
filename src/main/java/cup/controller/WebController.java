package cup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import cup.beans.CoffeeDrinks;
import cup.repository.CoffeeDrinksRepository;

/**
 * @author torirem - aaustin5
 * CIS175 - Fall 2023
 * Oct 29, 2023
 */
@Controller
public class WebController {
	@Autowired
	CoffeeDrinksRepository repo;
	
	@GetMapping({"/", "viewAll"})
		public String viewAllCoffeeDrinks(Model model) {
		if (repo.findAll().isEmpty()) {
			return addNewCoffeeDrink(model);
		}
		model.addAttribute("coffeedrinks", repo.findAll());
		return "results";
	}
	@GetMapping("/inputCoffeeDrink")
		public String addNewCoffeeDrink(Model model) {
			CoffeeDrinks cd = new CoffeeDrinks();
			model.addAttribute("newCoffeeDrink", cd);
			return "input";
	}
	
	@PostMapping("/inputCoffeeDrink")
		public String addNewCoffeeDrink(@ModelAttribute CoffeeDrinks cd, Model model) {
			repo.save(cd);
			return viewAllCoffeeDrinks(model);
	}
	
	@GetMapping("/edit/{id}")
		public String showUpdateCoffeeDrinks(@PathVariable("id") long id, Model model) {
			CoffeeDrinks cd = repo.findById(id).orElse(null);
			model.addAttribute("newCoffeeDrink", cd);
			return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseCoffeeDrink(CoffeeDrinks cd, Model model) {
		repo.save(cd);
		return viewAllCoffeeDrinks(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteDrink(@PathVariable("id") long id, Model model) {
		CoffeeDrinks cd = repo.findById(id).orElse(null);
		repo.delete(cd);
		return viewAllCoffeeDrinks(model);
	}
}

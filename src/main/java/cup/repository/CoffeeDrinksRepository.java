package cup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cup.beans.CoffeeDrinks;

/**
 * @author torirem - aaustin5
 * CIS175 - Fall 2023
 * Oct 16, 2023
 */
@Repository
public interface CoffeeDrinksRepository extends JpaRepository<CoffeeDrinks, Long>{

}

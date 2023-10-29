package cup.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author torirem - aaustin5
 * CIS175 - Fall 2023
 * Oct 16, 2023
 */
@Entity
public class CoffeeDrinks {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private int numShots;
	private String milkType;
	private boolean isIced;
	
	
	public CoffeeDrinks() {
		super();
		this.name = "black";
		this.numShots = 0;
		this.milkType = "None";
		this.isIced = false;
	}
	
	public CoffeeDrinks(String name) {
		super();
		this.name = name;
	}
	
	public CoffeeDrinks(String name, int shots, String milk) {
		super();
		this.name= name;
		this.numShots = shots;
		this.milkType = milk;
	}
	
	public CoffeeDrinks(String name, int shots, String milk, boolean ice) {
		super();
		this.name= name;
		this.numShots = shots;
		this.milkType = milk;
		this.isIced = ice;
	}
	
	public CoffeeDrinks(int id, String name, int shots, String milk, boolean ice) {
		super();
		this.id = id;
		this.name = name;
		this.numShots = shots;
		this.milkType = milk;
		this.isIced = ice;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the numShots
	 */
	public int getNumShots() {
		return numShots;
	}

	/**
	 * @param numShots the numShots to set
	 */
	public void setNumShots(int numShots) {
		this.numShots = numShots;
	}

	/**
	 * @return the milkType
	 */
	public String getMilkType() {
		return milkType;
	}

	/**
	 * @param milkType the milkType to set
	 */
	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}

	/**
	 * @return the isIced
	 */
	public boolean isIced() {
		return isIced;
	}

	/**
	 * @param isIced the isIced to set
	 */
	public void setIsIced(boolean isIced) {
		this.isIced = isIced;
	}
	
	/**
	 * @param isIced the isIced to get
	 */
	public boolean getIsIced() {
		return isIced;
	}

	@Override
	public String toString() {
		return "CoffeeDrinks [id=" + id + ", name=" + name + ", numShots=" + numShots + ", milkType=" + milkType
				+ ", isIced=" + isIced + "]";
	}
}

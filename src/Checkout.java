import java.util.HashMap;
import java.util.Scanner;

public class Checkout {
	
	public Checkout() {};
	
	public void addAllRules(String rules) {
		/*
		 * Assumed rules format is -
		 * N M
		 * N lines of products
		 * M lines of deals
		 */
	}
	
	public void addProduct(String name, int cost){
		//TODO
		//Names are presumed to be single characters
	}
	
	public void addDeal(String id, int cost){
		//TODO
		// eg, "AAA, 130" means three As cost 130 as a deal
		// 	   "AB, 75" means that an A and a B cost 75 as a deal
	}
	
	public int priceBasket(Basket basket) {
		//TODO
		return -1;
	}
	
	
}

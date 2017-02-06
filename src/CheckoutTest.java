import static org.junit.Assert.*;

import org.junit.Test;

public class CheckoutTest {

	@Test
	public void testPriceBasket() {
		Checkout co = new Checkout();
		co.addProduct("A", 50);
		
		Basket b = new Basket();
		b.addToBasket("A", 1);
		
		co.priceBasket(b);
		assertEquals(50, co.priceBasket(b));
	}

}

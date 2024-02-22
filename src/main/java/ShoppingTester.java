import java.util.List;

import controller.ShopperHelper;
import model.Shopper;

/**
 * @author Misti Christianson - mchristianson
 * CIS175 - Spring 2024
 * Feb 21, 2024
 */
public class ShoppingTester {

	public static void main(String[] args) {
		ShopperHelper sh = new ShopperHelper();

		Shopper bill = new Shopper("Bill");
		sh.insertShopper(bill);

		Shopper jim = new Shopper("Jim");
		sh.insertShopper(jim);

		List<Shopper> allShoppers = sh.showAllShoppers();
		for (Shopper a: allShoppers) {
			System.out.println(a.toString());
		}
	}

}

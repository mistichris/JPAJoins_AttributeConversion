import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import controller.ListDetailsHelper;
import controller.ShopperHelper;
import model.ListDetails;
import model.ListItem;
import model.Shopper;

/**
 * @author Misti Christianson - mchristianson
 * CIS175 - Spring 2024
 * Feb 21, 2024
 */
public class ListDetailsTester {

	public static void main(String[] args) {
		Shopper cameron = new Shopper("Cameron");
		ShopperHelper sh = new ShopperHelper();
//		sh.insertShopper(cameron);

		ListDetailsHelper ldh = new ListDetailsHelper();
		
		ListItem shampoo = new ListItem("Target", "Shampoo");
		ListItem brush = new ListItem("Target", "Brush");
		
		List<ListItem> cameronsItems = new ArrayList<ListItem>();
		cameronsItems.add(shampoo);
		cameronsItems.add(brush);

		ListDetails cameronList = new ListDetails("Cameron's ShoppingList", LocalDate.now(), cameron);
		cameronList.setListOfItems(cameronsItems);

		ldh.insertNewListDetails(cameronList);

		List<ListDetails> allLists = ldh.getLists();

		for (ListDetails a: allLists) {
			System.out.println(a.toString());
		}
	}

}

package oo2;
import java.util.ArrayList;

public class ShoppingBasket {

private	ArrayList<ShoppingBasketItem> items = new ArrayList<>();
	
	public  void add(ShoppingBasketItem item) {
		items.add(item);
	}
	 
	
	public ArrayList<ShoppingBasketItem> getItems() {
		return items;
	}
	
	
}

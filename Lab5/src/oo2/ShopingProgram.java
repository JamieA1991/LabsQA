package oo2;

import java.util.LinkedList;
import java.util.Queue;
public class ShopingProgram {
	static Queue<ShoppingBasket> baskets = new LinkedList<>();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingBasket basket1 = new ShoppingBasket();
	basket1.add(new ShoppingBasketItem("Football",1,5.00));
	basket1.add(new ShoppingBasketItem("Toothpaste",2,2.99));
	

	ShoppingBasket basket2 = new ShoppingBasket();
        basket2.add(new ShoppingBasketItem("Milk", 1, 2.49));
        basket2.add(new ShoppingBasketItem("Bread", 1, 1.99));
        

        baskets.add(basket1);
        baskets.add(basket2);
        
        processBaskets();

	}
public static void processBaskets() {
	
	
       while (!baskets.isEmpty()) {
    	   ShoppingBasket basket =baskets.poll();
    	   System.out.println("Processing Basket");
    	   for (ShoppingBasketItem item :basket.getItems()) {
    		   System.out.println(item.getDetails());
    	   }
    	   System.out.println("Basket procesed.\n");
       }



	}
}

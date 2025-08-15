package oopChallenge;
import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private List<ShoppingBasketItem> items;

    public ShoppingBasket() {
        items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        for (ShoppingBasketItem item : items) {
            if (item.getProduct().getId() == product.getId()) {
                item.increaseQuantity(quantity);
                return;
            }
        }
        items.add(new ShoppingBasketItem(product, quantity));
    }

    public List<ShoppingBasketItem> getItems() {
        return items;
    }

    public double getTotalCost() {
        double total = 0;
        for (ShoppingBasketItem item : items) {
            total += item.getTotalCost();
        }
        return total;
    }
}

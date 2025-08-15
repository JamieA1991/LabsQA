package oopChallenge;
public class ShoppingBasketItem {
    private Product product;
    private int quantity;

    public ShoppingBasketItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return product.price * quantity;
    }
    

public void increaseQuantity(int amount) {
    this.quantity += amount;
}

}

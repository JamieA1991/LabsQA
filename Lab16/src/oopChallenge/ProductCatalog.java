package oopChallenge;
import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<Product> products;

    public ProductCatalog() {
        products = new ArrayList<>();
        products.add(new Product(1, "Wireless Mouse", 15.99));
        products.add(new Product(2, "Mechanical Keyboard", 49.99));
        products.add(new Product(3, "USB-C Charger", 19.99));
        products.add(new Product(4, "Noise Cancelling Headphones", 89.99));
        products.add(new Product(5, "Webcam 1080p", 39.99));
    }

    public void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println("- ID " + product.getId() + ": " + product.getProductName() + " (£" + product.getPrice() + ")");
        }
    }

    public Product findProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}

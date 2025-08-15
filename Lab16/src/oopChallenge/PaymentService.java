package oopChallenge;

public class PaymentService {
    public void makePayment(ShoppingBasket basket, String method) {
        if (basket == null || basket.getItems().isEmpty()) {
            System.out.println("Basket is invalid or empty.");
            System.out.println("Payment failed due to invalid basket.");
            return;
        }

        double totalCost = basket.getTotalCost();
        if (totalCost <= 0) {
            System.out.println("Basket total is zero or invalid.");
            System.out.println("Payment failed due to invalid total.");
            return;
        }

        // Simulate payment method selection
        System.out.println("Processing " + method + " payment of £" + totalCost + "...");
        try {
        	Thread.sleep(2000);
        } catch (InterruptedException e) {
        	System.out.println("Payment failed. Please try again.");
        	return;
        }
        System.out.println("Payment successful. Thank you for your purchase!");
    }
}


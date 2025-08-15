package oopChallenge;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ProductCatalog catalog = new ProductCatalog();
		ShoppingBasket basket = new ShoppingBasket();
		PaymentService paymentService = new PaymentService();
		NotificationService notificationService = new NotificationService();

		catalog.displayProducts();

		System.out.println("\nEnter the ID of the product to add to your basket (type 0 to finish):");
		while (true) {
			System.out.print("Product ID: ");

			int id;
			while (true) {
				System.out.print("Product ID: ");
				String input = scanner.nextLine();
				if (input.trim().isEmpty()) {
					System.out.println("Please enter a valid number.");
					continue;
				}
				try {
					id = Integer.parseInt(input);
					break;
				} catch (NumberFormatException e) {
					System.out.println("Invalid input. Please enter a number.");
				}
			}

			if (id == 0)
				break;

			Product product = catalog.findProductById(id);
			if (product != null) {
				System.out.print("Quantity: ");
				int quantity = Integer.parseInt(scanner.nextLine());
				basket.addItem(product, quantity);
				System.out.println(quantity + " x " + product.productName + " added to basket.");
			} else {
				System.out.println("Invalid ID. Please try again.");
			}
		}

		System.out.println("\nYour basket:");
		for (ShoppingBasketItem item : basket.getItems()) {
			System.out.println("- " + item.getQuantity() + " x " + item.getProduct().productName + " (£"
					+ item.getTotalCost() + ")");
		}
		System.out.println("Total: £" + basket.getTotalCost());

	

		System.out.println("\nChoose a payment method:");
		System.out.println("1 - Card");
		System.out.println("2 - Google Pay");
		System.out.println("3 - Apple Pay");
		System.out.println("4 - Klarna");

		int methodId;
		String method = "";
		while (true) {
			System.out.print("Enter the number of your payment method: ");
			String input = scanner.nextLine().trim();
			try {
				methodId = Integer.parseInt(input);
				switch (methodId) {
				case 1:
					method = "Card";
					break;
				case 2:
					method = "Google Pay";
					break;
				case 3:
					method = "Apple Pay";
					break;
				case 4:
					method = "Klarna";
					break;
				default:
					System.out.println("Invalid selection. Please choose a number between 1 and 4.");
					continue;
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a number.");
			}
		}

		paymentService.makePayment(basket, method);

	
		System.out.print("\nEnter your email to receive confirmation: ");
		String email = scanner.nextLine();
		notificationService.sendOrderConfirmation(email);

		scanner.close();
	}
}

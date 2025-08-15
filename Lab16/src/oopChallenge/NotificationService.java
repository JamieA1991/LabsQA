package oopChallenge;
public class NotificationService {
    public void sendOrderConfirmation(String email) {
        if (email == null || email.trim().isEmpty() || !isValidEmail(email)) {
            System.out.println("Invalid email address. Confirmation not sent.");
            return;
        }

        // Simulate sending confirmation
        System.out.println("Sending order confirmation to " + email + "...");
        System.out.println("Confirmation email sent successfully.");
    }

    private boolean isValidEmail(String email) {
        // Basic email validation pattern
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
}

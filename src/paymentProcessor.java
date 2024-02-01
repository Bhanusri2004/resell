public class paymentProcessor {
    public boolean processPayment(double amount, String username, String password) {
        user user = new user(username, password);
        if (user.authenticate(username, password)) {
            // Process the payment
            System.out.println("Payment processed successfully!");
            return true;
        } else {
            System.out.println("Authentication failed. Payment processing failed.");
            return false;
        }
    }
}

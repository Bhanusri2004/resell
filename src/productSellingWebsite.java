public class productSellingWebsite {
    public static void main(String[] args) {
        product product1 = new product("iPhone 12", 999.99);
        product product2 = new product("Samsung Galaxy S21", 899.99);
        shoppingCart cart = new shoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        double totalPrice = cart.getTotalPrice();
        System.out.println("Total price: $" + totalPrice);
        paymentProcessor paymentProcessor = new paymentProcessor();
        boolean paymentStatus = paymentProcessor.processPayment(totalPrice, "john123", "password123");
        if (paymentStatus) {
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Order placement failed.");
        }
    }

}

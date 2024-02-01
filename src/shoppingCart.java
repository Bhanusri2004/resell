import java.util.ArrayList;
import java.util.List;

public class shoppingCart {
    private List<product> products;

    public shoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(product product) {
        products.add(product);
    }

    public void removeProduct(product product) {
        products.remove(product);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}

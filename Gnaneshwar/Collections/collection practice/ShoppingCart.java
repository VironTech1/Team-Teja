import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double value;

    public Product(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + ": $" + value;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        List<Product> shoppingCart = new ArrayList<>();

        shoppingCart.add(new Product("Carrot", 2));
        shoppingCart.add(new Product("Capsicum", 1));
        shoppingCart.add(new Product("Cauliflower", 3));

        System.out.println("Shopping Cart:");
        for (Product product : shoppingCart) {
            System.out.println(product);
        }

        double totalValue = 0;
        for (Product product : shoppingCart) {
            totalValue += product.getValue();
        }
        System.out.println("Total Value: $" + totalValue);

        shoppingCart.remove(1); 

        System.out.println("\nShopping Cart after removing a product:");
        for (Product product : shoppingCart) {
            System.out.println(product);
        }

        
        totalValue = 0;
        for (Product product : shoppingCart) {
            totalValue += product.getValue();
        }
        System.out.println("Total Value: $" + totalValue);
    }
}

import java.util.*;

public class ProductStore {
    private List<Product> products = new ArrayList<>();

    public ProductStore() {
        products.add(new Product(1, "Laptop", 55000));
        products.add(new Product(2, "Headphones", 1500));
        products.add(new Product(3, "Keyboard", 800));
        products.add(new Product(4, "Smartwatch", 3200));
    }

    public void showProducts() {
        products.forEach(System.out::println);
    }

    public Product getById(int id) {
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst().orElse(null);
    }
}

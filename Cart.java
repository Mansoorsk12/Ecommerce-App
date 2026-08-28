import java.util.*;

public class Cart {
    private Map<Integer, CartItem> items = new HashMap<>();

    public void addToCart(Product product, int qty) {
        if(items.containsKey(product.getId())) {
            CartItem old = items.get(product.getId());
            qty += old.getQty();
        }
        items.put(product.getId(), new CartItem(product, qty));
    }

    public double getTotal() {
        return items.values().stream().mapToDouble(CartItem::getTotal).sum();
    }

    public void showCart() {
        if(items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        items.values().forEach(System.out::println);
        System.out.println("Total: Rs." + getTotal());
    }

    public void clear() {
        items.clear();
    }
}

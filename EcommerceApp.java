import java.util.Scanner;

public class EcommerceApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductStore store = new ProductStore();
        Cart cart = new Cart();

        boolean run = true;

        while(run) {
            System.out.println("\n===== E-Commerce App =====");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch(ch) {
                case 1:
                    store.showProducts();
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int pid = sc.nextInt();
                    Product p = store.getById(pid);
                    if(p == null) {
                        System.out.println("Invalid product.");
                        break;
                    }
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    cart.addToCart(p, qty);
                    System.out.println("Added successfully.");
                    break;

                case 3:
                    cart.showCart();
                    break;

                case 4:
                    double total = cart.getTotal();
                    if(total <= 0) {
                        System.out.println("Cart is empty.");
                        break;
                    }
                    Order order = new Order(total);
                    order.printOrder();
                    cart.clear();
                    break;

                case 5:
                    run = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
        sc.close();
        System.out.println("Thank you for shopping.");
    }
}

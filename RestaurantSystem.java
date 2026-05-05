import java.util.*;

class RestaurantSystem {
    private AuthService auth = new AuthService();
    private Scanner scanner = new Scanner(System.in);

    void start() {
        System.out.println("=== Welcome to Restaurant System ===");

        System.out.print("Username: ");
        String user = scanner.nextLine();

        System.out.print("Password: ");
        String pass = scanner.nextLine();

        if (!auth.login(user, pass)) {
            System.out.println("Invalid login!");
            return;
        }

        System.out.println("Login successful!");

        List<FoodItem> menu = new ArrayList<>();
        menu.add(new FoodItem("Burger", 5.99));
        menu.add(new FoodItem("Pizza", 8.99));
        menu.add(new FoodItem("Drink", 2.50));

        Order order = new Order();

        while (true) {
            System.out.println("\nMenu:");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println(i + ". " + menu.get(i).name + " - $" + menu.get(i).price);
            }

            System.out.print("Select item index (-1 to finish): ");
            int choice = scanner.nextInt();

            if (choice == -1) break;

            if (choice >= 0 && choice < menu.size()) {
                order.addItem(menu.get(choice));
                System.out.println("Item added!");
            } else {
                System.out.println("Invalid choice!");
            }
        }

        System.out.println("\nYour Order:");
        order.showOrder();
    }
}
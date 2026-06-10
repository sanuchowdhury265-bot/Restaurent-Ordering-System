import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Start System
        RestaurantSystem system =
                new RestaurantSystem();

        system.startSystem();

        // Login
        System.out.print("Enter Username: ");
        String username = input.nextLine();

        System.out.print("Enter Password: ");
        String password = input.nextLine();

        AuthService auth =
                new AuthService();

        if (auth.login(username, password)) {

            System.out.println(
                "\nLogin Successful!"
            );

        } else {

            System.out.println(
                "\nLogin Failed!"
            );

            return;
        }

        // Create Order
        Order order = new Order();

        int choice;

        do {

            System.out.println(
                "\n===== MENU ====="
            );

            System.out.println(
                "1. Burger - $5.99"
            );

            System.out.println(
                "2. Pizza - $8.50"
            );

            System.out.println(
                "3. Exit"
            );

            System.out.print(
                "Choose Item: "
            );

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    FoodItem burger =
                            new FoodItem(
                                "Burger",
                                5.99
                            );

                    order.addItem(burger);

                    System.out.println(
                        "Burger Added!"
                    );

                    break;

                case 2:

                    FoodItem pizza =
                            new FoodItem(
                                "Pizza",
                                8.50
                            );

                    order.addItem(pizza);

                    System.out.println(
                        "Pizza Added!"
                    );

                    break;

                case 3:

                    System.out.println(
                        "Order Complete!"
                    );

                    break;

                default:

                    System.out.println(
                        "Invalid Choice!"
                    );
            }

        } while (choice != 3);

        // Show Order
        System.out.println(
            "\n===== ORDER ITEMS ====="
        );

        for (FoodItem item : order.getItems()) {

            System.out.println(item);
        }

        // Total
        double total =
                order.calculateTotal();

        System.out.println(
            "\nTotal Bill: $" + total
        );

        // Payment
        PaymentService payment =
                new PaymentService();

        System.out.println(
            payment.processPayment(total)
        );

        // Reservation
        input.nextLine();

        System.out.print(
            "\nEnter Customer Name: "
        );

        String customer =
                input.nextLine();

        System.out.print(
            "Enter Table Number: "
        );

        int table =
                input.nextInt();

        Reservation reservation =
                new Reservation(
                    customer,
                    table
                );

        System.out.println(
            "\nReservation Successful!"
        );

        System.out.println(
            reservation.getReservationDetails()
        );

        input.close();
    }
}
import java.util.*;

class Order {
    private List<FoodItem> items = new ArrayList<>();

    void addItem(FoodItem item) {
        items.add(item);
    }

    double getTotal() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.price;
        }
        return total;
    }

    void showOrder() {
        for (FoodItem item : items) {
            System.out.println(item.name + " - $" + item.price);
        }
        System.out.println("Total: $" + getTotal());
    }
}
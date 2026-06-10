import java.util.ArrayList;

class Order {

    private ArrayList<FoodItem> items;

    Order() {
        items = new ArrayList<>();
    }

    void addItem(FoodItem item) {
        items.add(item);
    }

    double calculateTotal() {

        double total = 0;

        for (FoodItem item : items) {
            total += item.getPrice();
        }

        return total;
    }

    ArrayList<FoodItem> getItems() {
        return items;
    }
}
package builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem (Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 1f;
        for (Item item : items){
            cost += item.price();
        }

        return cost;
    }

    public void showItems() {
        items.stream().forEach(
                item -> {
                    System.out.println("item: " + item.name());
                    System.out.println("packing :" + item.packing().pack());
                    System.out.println("price: " + item.price());
                }
        );
    }
}

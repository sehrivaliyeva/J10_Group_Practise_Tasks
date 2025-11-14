package lesson8;

public class Main {
    public static void main(String[] args) {
        Food food1;
        Food food2;
        Food food3;

        RestaurantMenu restaurantMenu = new RestaurantMenu();

        restaurantMenu.add(new Food("alma", 2));
        restaurantMenu.add(new Food("heyva", 5));
        restaurantMenu.add(new Food("nar", 3));

        for (Food f : restaurantMenu.foods) {
            f.printInfo();
        }

    }
}

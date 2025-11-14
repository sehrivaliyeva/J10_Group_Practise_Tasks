package lesson8;

public class RestaurantMenu {


    Food[] foods = new Food[3];

    public void add(Food food) {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i] == null) {
                foods[i] = food;
                break;
            }
        }
    }

}

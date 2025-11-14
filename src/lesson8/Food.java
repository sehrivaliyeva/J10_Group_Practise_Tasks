package lesson8;

public class Food {
    String name;
    int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }


}

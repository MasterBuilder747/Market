package Main;

public class Store {

    public static void main(String[] args) {

        Item apple = new Item();
        apple.addPrice(0.99);

        System.out.println("Apples are: $" + apple.getPrice());
        System.out.println("Apples weigh " + apple.getWeight() + "oz on average.");

    }

}

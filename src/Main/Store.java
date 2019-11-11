package Main;

import java.util.Scanner;
import java.util.Random;

public class Store {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Name your new item (do NOT put an s at the end): ");
        Item item = new Item(kb.next(), 0.99, 5.4);
        System.out.println("Set the price of the item: ");
        item.setPrice(kb.nextDouble());

        System.out.println(item.getName() + "s are: $" + item.getPrice());

        System.out.println("How much do " + item.getName() + "s weigh?");
        item.setWeight(kb.nextDouble());

        System.out.println(item.getName() + "s weigh " + item.getWeight() + " oz on average.");

        System.out.println(item.getName() + " cost $" + item.getPricePerOZ() + " per oz.");

        //using a method from another object works!
        System.out.println("rounding here: " + item.round(1.99, 0));

    }
}

package Main;

import java.util.Scanner;

public class Store {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        Item apple = new Item(0.99, 5.4);
        apple.addPrice(0.99);

        System.out.println("Apples are: $" + apple.getPrice());

        System.out.println("How much do apples weigh?");
        apple.addWeight(kb.nextDouble());

        System.out.println("Apples weigh " + apple.getWeight() + " oz on average.");

        System.out.println("Apples cost $" + apple.getPricePerOZ() + " per oz.");

    }



}

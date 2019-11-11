package Main;

import java.util.Random;

class Item {

    private String name; //name of the item
    private double price; //in US dollars ($), .00 format
    private double weight; //in ounces (oz)

    //specific ID for the item, as names are harder to handle internally
    //this is a random int, 0 to 1,000,000 at most
    Random r = new Random();
    final int ID = Math.abs(r.nextInt(1000000));

    Item(String n) {
        //can optionally have no attributes when initializing
        //name is required
        name = n;
    }

    Item(String n, double p) {
        name = n;
        price = p;
    }

    Item(String n, double p, double w) {
        name = n;
        price = p;
        weight = w;
    }

    //getters
    int getID() {
        return ID;
    }
    String getName() {
        return name;
    }
    double getPrice() {
        return price;
    }
    double getWeight() {
        return round(weight, 3);
    }
    double getPricePerOZ() {
        if (price != 0) {
            if (weight != 0) {
                return round((price / weight), 2);
            }else{
                return 0;
            }
        }else{
            return 0;
        }
    }

    //setters
    void setPrice(double p) {
        price = p;
    }
    void setWeight(double w) {
        weight = w;
    }
    void setName(String n) {
        name = n;
    }

    //implement my own rounding method for reusability
    //however, this can only be in each class, not in the main method (needs more work here)
    //TODO: find a way to remove the .0 off of integer double values, cannot output a different data value
    //also strings are annoying to handle
    double round(double i, int p) {
        //multiply by places, cast to int, divide by places
        //i = input, p = decimal places, 0 or larger

        //get places var to work
        double places = 1;
        if (p > 0) {
            for (int j = p; j > 0; j--) {
                places = places * 10;
            }
        }
        
        return ((int)((i * places) + 0.5)) / places;
    }
}

package Main;

class Item {

    private double price; //in US dollars ($)
    private double weight; //in ounces (oz)

    Item() {
        //can optionally have no attributes when initializing
    }

    Item(double p) {
        price = p;
    }

    Item(double p, double w) {
        price = p;
        weight = w;
    }

    void addPrice(double p) {
        price = p;
    }

    double getPrice() {
        return price;
    }

    void addWeight(double w) {
        weight = w;
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

    //implement my own rounding method for reusability
    //however, this can only be in each class, not in the main method (needs more work here)
    //TODO: find a way to remove the .0 off of integer double values, cannot output a different data value
    //also strings are annoying to handle
    public static double round(double i, int p) {
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

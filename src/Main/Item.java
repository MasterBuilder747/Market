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
        return weight;
    }

}

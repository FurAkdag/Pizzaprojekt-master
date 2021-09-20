package pizzaprojekt.model.tools;

public class Order {

    int doener;
    int pizza;
    int salad;
    int water;
    int juice;
    int lemonade;

    public Order(int numberDoener, int numberPizza, int numberSalad, int numberWater, int numberJuice, int numberLemonade, boolean ready) {
        doener = numberDoener;
        pizza = numberPizza;
        salad = numberSalad;
        water = numberWater;
        juice = numberJuice;
        lemonade = numberLemonade;
        orderDone(ready);
    }

    public void printz() {

    }

    public boolean orderDone(boolean done) {
        return done;
    }

    public int getDoener() {
        return doener;
    }

    public int getPizza() {
        return pizza;
    }

    public int getSalad() {
        return salad;
    }

    public int getWater() {
        return water;
    }

    public int getJuice() {
        return juice;
    }

    public int getLemonade() {
        return lemonade;
    }
}

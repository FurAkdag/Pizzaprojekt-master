package pizzaprojekt.model.people;

import pizzaprojekt.model.food.*;
import pizzaprojekt.model.tools.*;

public class Worker{
    private KebabSkewer kebabSkewer;
    private Furnace furnace;
    private SaladStorage saladStorage;
    private Drink drink;

    public Worker(){
        kebabSkewer = new KebabSkewer();
        saladStorage = new SaladStorage();
        furnace = new Furnace();
        drink = new Drink();

    }



    public void setForename() {

    }

    public void processOrder(int food, int type){
        switch(food){
            case 1:
                kebabSkewer.makeKebab(type);
            break;
            case 2:
                try {
                    furnace.use(type);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 3: saladStorage.use(type);
            break;
            case 4: Drink drink = new Drink(type);
            break;
        }
    }



}

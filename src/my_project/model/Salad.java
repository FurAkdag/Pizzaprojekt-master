package my_project.model;

public class Salad extends MenuCard {

    public Salad(int saladType){
        s(saladType);
    }

    public String s(int Type){
        ingredians = new String[2];
        ingredians[0]="Salat mit alles!";
        ingredians[1]="Salat one Kaese!";
        return ingredians[Type];
    }
}

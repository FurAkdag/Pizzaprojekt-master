package pizzaprojekt.model.people;

public class Guest{

    private String username;
    private String password;
    private String favoriteFood;
    private double budget; // Todo: In der App sein Budget angeben

    public Guest(int numberDoener, int numberPizza, int numberSalad, int numberWater, int numberJuice, int numberLemonade, boolean ready){
        this.username = username;
        this.password = password;
        this.favoriteFood = favoriteFood;
        this.budget = budget;
        setForename();

    }

    public void register(){
    }

    public void setForename(){

    }

    public void login(){

    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFavoriteFood(){
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood = favoriteFood;
    }

    public double getBudget(){
        return budget;
    }

    public void setBudget(double Budget){
        this.budget = budget;
    }
}

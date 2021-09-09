package my_project.model;

public class Guest extends Human{
    private String username;
    private String password;
    private String favoriteFood;
    private double budget; // Todo: In der App sein Budget angeben

    public Guest(){
        this.username = username;
        this.password = password;
        this.favoriteFood = favoriteFood;
        this.budget = budget;
    }

    public void register(){
    }

    public void login() {
    }

    public void doOrder(){
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

package my_project.model;

public abstract class MenuCard {

    protected int price;
    protected boolean orderReady;
    protected String ingredians;

    public MenuCard(){
        this.price = price;
        this.orderReady = orderReady;
        this.ingredians = ingredians;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getOrderReady(){
        return orderReady;
    }

    public void setOrderReady(boolean orderReady) {
        this.orderReady = orderReady;
    }

    public String getIngredians(){
        return ingredians;
    }

    public void setIngredians(String ingredians) {
        this.ingredians = ingredians;
    }
}

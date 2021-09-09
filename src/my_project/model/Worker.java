package my_project.model;

public class Worker extends Human {
    private Furnace furnace[] = new Furnace[3];
    private KebabSkewer kebabSkewer[] = new KebabSkewer[3];
    private SaladStorage saladStorage;

    public Worker() throws InterruptedException {
        furnace [1] = new Furnace();
        ((Furnace)furnace[1]).bake();    //muss noch herausfinden wie ich das mit dem backen verwirklichen soll
    }

    public void setFurnace(Furnace[] furnace) {
        this.furnace = furnace;
    }

    public Furnace[] getFurnace() {
        return furnace;
    }

    public void setKebabSkewer(KebabSkewer[] kebabSkewer) {
        this.kebabSkewer = kebabSkewer;
    }

    public KebabSkewer[] getKebabSkewer() {
        return kebabSkewer;
    }

    public void setSaladStorage(SaladStorage saladStorage) {
        this.saladStorage = saladStorage;
    }

    public SaladStorage getSaladStorage() {
        return saladStorage;
    }
    public void processOrder(){

    }
}

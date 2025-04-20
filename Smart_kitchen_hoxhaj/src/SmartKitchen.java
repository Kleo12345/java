public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
    void addWater(){
        getBrewMaster().brewCoffee();
    }
    void pourMilk(){
        getIceBox().orderFood();
    }
    void loadDishWasher(){
        getDishWasher().doDishes();
    }
    void setKitchenState(boolean b1, boolean b2, boolean b3){
        getDishWasher().doDishes();
        getIceBox().orderFood();
        getBrewMaster().brewCoffee();
    }
    void doKitchenWork(){

    }
}

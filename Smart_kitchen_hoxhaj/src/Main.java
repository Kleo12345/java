public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker(false);
        Refrigerator refrigerator = new Refrigerator(false);
        DishWasher dishWasher = new DishWasher(false);

        SmartKitchen kitchen = new SmartKitchen(coffeeMaker,dishWasher,refrigerator);

        kitchen.addWater();
        kitchen.pourMilk();
        kitchen.doKitchenWork();

        kitchen.getBrewMaster().brewCoffee();
        kitchen.getIceBox().orderFood();
        kitchen.getDishWasher().doDishes();

        kitchen.setKitchenState(true, true, true);

        kitchen.doKitchenWork();
    }
}

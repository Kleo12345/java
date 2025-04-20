public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("The work is being done by Coffee Maker");
        }else hasWorkToDo = true;
    }
}

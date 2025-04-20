public class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public  void doDishes(){
        if (hasWorkToDo){
            System.out.println("The work is being done by Dish Washer ");
        }else hasWorkToDo = true;
    }
}

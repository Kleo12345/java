public class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("The work is being done by the refrigerator ");
        }else hasWorkToDo = true;
    }
}

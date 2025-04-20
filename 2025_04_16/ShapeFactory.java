
public class ShapeFactory {
    private Triangle triangle ;
    private Square square;

    public ShapeFactory(Triangle triangle, Square square) {
        this.triangle = triangle;
        this.square = square;
    }

    public void drawShape(String s){
        if (s.equalsIgnoreCase("t")){
            triangle.draw();
        } else if (s.equalsIgnoreCase("s")) {
            square.draw();
        }else{
            System.out.println("There is no figure corresponding to your request");
        }
    }
}

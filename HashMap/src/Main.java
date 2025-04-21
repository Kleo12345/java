import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap <String,HashMap<String,HashMap<String,String>>> nesting= new HashMap<>();
        HashMap <String, HashMap<String,String>> innerNesting = new HashMap<>();
        HashMap <String,String> innerInnerNesting = new HashMap<>();
        innerInnerNesting.put("Paris","Amazing city to visit");//Key : cities , Value : A description
        innerNesting.put("France", innerInnerNesting); //Key : countries , Value : the HashMap of cities
        nesting.put("Europe",innerNesting);// Key : Continents, Value : the HashMap of countries
        nesting.get("Europe").get("France").get("Paris");
        System.out.println(nesting);
    }
}
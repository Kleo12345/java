import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test = "brutto.ma no.basta";
        var cens = new CensuraParola();
        cens.textModifier(test);
        var form = new FormattedText();
        form.textModifier(test);
    }
}

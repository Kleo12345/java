public class FormattedText extends TextEditor{
    @Override
    void textModifier(String input) {
        String s =  input.replaceAll("\\.","\n").trim().toLowerCase();
        System.out.println(s);
    }
}

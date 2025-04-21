public class CensuraParola extends TextEditor{
    String[] ar= new String[]{"brutto","stupido"};
    @Override
    void textModifier(String input) {
        for (String s : ar) {
            input = input.replaceAll(s,s.replaceAll(".","*"));
        }
        System.out.println(input);
    }
}

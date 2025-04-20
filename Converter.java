public class es1_hoxhaj {
    public static double convertToCentimeters(int inches) {
        return (inches*2.54);
    }
    public static double convertToCentimeters(int feet, int inches){
        int totalInches = (feet*12) +inches;
        return convertToCentimeters(totalInches);
    }
    public static void main(String[] args) {
        double height1 = convertToCentimeters(68);
        System.out.println(height1);
        double height2 = convertToCentimeters(3,8);
        System.out.println(height2);
    }
}

public class WrapperClassPractice {
    @SuppressWarnings( "deprecation" )
    public static void main(String[] args) {
        Integer age = new Integer(25);
        Double height = new Double(62.5);

        System.out.println("Age: " + age.intValue());
        System.out.println("Height: " + height.intValue());

        System.out.println("Integer min value: " + Integer.MIN_VALUE);
        System.out.println("Integer max value: " + Integer.MAX_VALUE);
    }
}
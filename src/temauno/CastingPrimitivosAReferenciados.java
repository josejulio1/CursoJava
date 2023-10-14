package temauno;

public class CastingPrimitivosAReferenciados {
    public static void main(String[] args) {
        int a = 5;
        String numString = String.valueOf(a);
        String charString = String.valueOf('d');
        String doubleString = String.valueOf(5.5D);
        String floatString = String.valueOf(5.5F);
        String booleanString = String.valueOf(true);
        String longString = String.valueOf(3L);
        String shortString = String.valueOf((short) 10);
        String byteString = String.valueOf((byte) 5);
    }
}
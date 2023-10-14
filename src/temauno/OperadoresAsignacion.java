package temauno;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int a = 3;
        int b = 145;

        // Estos dos ejemplos a continuación son lo mismo
        a = a + 5;
        a += 5;
        System.out.println(a);

        // Estos dos ejemplos a continuación son lo mismo
        a = a - 2;
        a -= 2;
        System.out.println(a);

        // Estos dos ejemplos a continuación son lo mismo
        a = a * 7;
        a *= 7;
        System.out.println(a);

        // Estos dos ejemplos a continuación son lo mismo
        a = a / 2;
        a /= 2;
        System.out.println(a);

        // Estos dos ejemplos a continuación son lo mismo
        a = a % 2;
        a %= 2;
        System.out.println(a);
    }
}
package temauno;

public class Variables {
    public static void main(String[] args) {
        // Texto
        String cadena = "Hola Mundo";

        // Números enteros
        long a = 2147483645; // 2^63 | 8 bytes o 64 bits
        int b = 2147483647; // -2.147.483.648 a 2.147.483.647 | 2^31 | 4 bytes o 32 bits
        short c = (short) 32.767; // -32.768 a 32.767 | 2 bytes o 16 bits
        byte d = 127; // -128 a 127 | 1 byte o 8 bits

        // Números flotantes o decimales
        double doub = 8.0D; // 2^63 | 8 bytes o 64 bits
        float f = 5F; // 2^31 | 4 bytes o 32 bits

        // Carácter -> Se fija en la tabla ASCII | 1 bytes o 8 bits
        char character = 'b'; // 98
        char character1 = 97; // 'a'

        // Booleanos -> true o false
        boolean isPasswordCorrect = true;
        boolean isLowerCase = false;

        System.out.println(Long.MAX_VALUE); // Mirar el valor máximo que soporta un long
        System.out.println(Integer.MAX_VALUE); // Mirar el valor máximo que soporta un int
        System.out.println(Short.MAX_VALUE); // Mirar el valor máximo que soporta un short
        System.out.println(Byte.MAX_VALUE); // Mirar el valor máximo que soporta un byte
        System.out.println(Double.MAX_VALUE); // Mirar el valor máximo que soporta un double
        System.out.println(Float.MAX_VALUE); // Mirar el valor máximo que soporta un float
        System.out.println(Character.MAX_VALUE); // Mirar el valor máximo que soporta un char
    }
}
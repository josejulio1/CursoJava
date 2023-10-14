package temauno;

public class CastingPrimitivos {
    public static void main(String[] args) {
        // Cuando se hacen conversiones o castings entre tipos de datos PRIMITIVOS, se utiliza
        // el casting
        byte b = (byte) 30000; // Pasar de un tipo de dato int a un byte

        // Cuando se pasa un tipo de dato más pequeño (byte) a otro tipo de dato más grande (int),
        // al no haber pérdida de precisión, se realiza un casting IMPLÍCITO o automático
        byte numByte = 56;
        int entero = numByte; // Se está guardando un tipo byte en un int

        // Cuando se pasa un tipo de dato más grande (long) a otro tipo de dato más pequeño (int),
        // se produce una pérdida de precisión, ya que el número no cabe. A esto se le llama
        // casting EXPLÍCITO o manual
        long l = 500L;
        int a = (int) l;

        // Al convertir de un número entero a un número decimal, la conversión se hace IMPLÍCITA o
        // automática porque no hay pérdida de información, ya que los números enteros no tienen decimales
        double d = 58457845;

        // Al convertir un número decimal a número entero, sí hay que realizar un casting EXPLÍCITO o
        // manual, incluso siendo tipos de datos que pueden almacenar la misma cantidad de números o
        // misma parte entera (por ejemplo, un float o un int ambos soportan 2^31), ya que al convertir
        // un número decimal a entero, hay pérdida de información porque se pierden los decimales
        int num = (int) 94784F;

        char character = (char) 97; // 'a'
        int numChar = 'a'; // 97
    }
}
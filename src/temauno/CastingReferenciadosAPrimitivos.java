package temauno;

public class CastingReferenciadosAPrimitivos {
    public static void main(String[] args) {
        // Para pasar de tipo referenciado (String) a un número, se debe utilizar
        // la respectiva clase wrapper o envoltoria del número al que se quiere convertir
        // Por ejemplo, si se quiere convertir "50" de tipo String a int, se debe utilizar
        // la clase envoltoria de int que es Integer, y usar el método valueOf().
        // int num = Integer.valueOf("50"); // 50

        long numLongValueOf = Long.valueOf("32L"); // 32 -> long
        // o
        long numLongParseLong = Long.parseLong("55"); // 55 -> long

        String texto = "5434";
        int numIntValueOf = Integer.valueOf(texto); // 5434 -> int
        // o
        int numIntParseInt = Integer.parseInt("5434"); // 5434 -> int

        short numShortValueOf = Short.valueOf("43"); // 43 -> short
        // o
        short numShortParseShort = Short.parseShort("43"); // 43 -> short

        byte numByteValueOf = Byte.valueOf("35"); // 35 -> byte
        // o
        byte numByteParseByte = Byte.parseByte("35"); // 35 -> byte


        double numDoubleValueOf = Double.valueOf("589D"); // 589.0 -> double
        // o
        double numDoubleParseDouble = Double.parseDouble("55"); // 55.0 -> double

        boolean booleanValueOf = Boolean.valueOf("true"); // true -> boolean
        // o
        boolean booleanParseBoolean = Boolean.parseBoolean("true"); // true -> boolean
    }
}
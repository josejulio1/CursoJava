package temados;

import java.util.Arrays;

public class ManejoStrings {
    public static void main(String[] args) {
        String texto = "Hola Mundo";
        System.out.print("Texto\n\n\n"); // Salto línea -> \n -> new line
        System.out.print("Hola\t\t\t\tTexto\n"); // Tabulación
        System.out.println("Hola".repeat(4)); // Repetir cadena x veces

        System.out.println("1");
        System.out.println("\t2");
        System.out.println("\t\t3");
        System.out.println("\t\t\t4");

        System.out.println();

        System.out.println("1");
        System.out.println("\t2");
        System.out.println("\t".repeat(2) + "3"); // Crear 2 tabulaciones
        System.out.println("\t".repeat(3) + "4");

        // length permite conocer la longitud de la cadena (total de carácteres que hay)
        // Los espacios se incluyen como carácter, todo lo que haya dentro de las comillas dobles
        System.out.println(texto.length()); // 10

        // charAt obtiene el carácter de una cadena pasando la posición del carácter deseado
        // Obtener el tercer carácter (empieza a contar desde 0)
        System.out.println(texto.charAt(2)); // l

        String numeroStr = "1.234.567.890";
        // indexOf hace lo contrario al charAt. Obtiene el índice de un carácter pasado por parámetro.
        // En caso de que no exista, devuelve -1. En caso de haber varias coincidencias, cogerá la primera
        // Obtener el índice del primer punto
        System.out.println(numeroStr.indexOf(".")); // 1

        // lastIndexOf obtiene el índice de un carácter pasado por parámetro. Su diferencia con indexOf
        // es que este devuelve el índice de la última coincidencia en caso de que haya
        System.out.println(numeroStr.lastIndexOf(".")); // 9

        // substring "trocea" o coge una parte de una cadena, a partir de una posición de inicio,
        // y opcional, una final
        // Obtener la palabra "Hola"
        System.out.println(texto.substring(0, 5)); // En caso de indicar la posición de fin,
        // hay que sumarle +1 al índice de fin, ya que se puede pensar que para coger la
        // cadena "Hola" es del 0 al 4, pero esto no es así debido a que el índice de fin es
        // exclusivo, por lo que no cuenta, por lo que sería del 0 al 5
        // Obtener la palabra "Mundo"
        System.out.println(texto.substring(5)); // Coge la palabra de la posición 5 hasta el final de la cadena
        // Otra forma
        System.out.println(texto.substring(5, texto.length()));

        String textoEspacios = "   Hola Mundo   ";
        // trim elimina los espacios SOLO del inicio y del final de la cadena, si los hay
        System.out.println(textoEspacios.trim()); // "Hola Mundo"

        // toUpperCase transforma un String a mayúscula todo
        System.out.println(texto.toUpperCase());

        // toLowerCase transforma un String a minúscula todo
        System.out.println(texto.toLowerCase());

        // equals comprueba si una cadena es EXACTAMENTE IGUAL a otra
        System.out.println(texto.equals("Hola Mund")); // false

        // equalsIgnoreCase comprueba si una cadena es igual a otra pero sin tener en cuenta mayúsculas ni minúsculas
        System.out.println(texto.equalsIgnoreCase("HOLA MUNDO")); // true

        // contains comprueba si una cadena contiene un String pasado
        System.out.println(texto.contains("Hola")); // true

        // replace reemplaza una cadena de caracteres por otra
        // Reemplaza todas las 'o' por una 'a'
        System.out.println(texto.replace('o', 'a')); // "Hala Munda"
        // Reemplaza "Hola" por "Adiós"
        System.out.println(texto.replace("Hola", "Adiós")); // "Adiós Mundo"

        // startsWith comprueba si una cadena empieza por un texto
        System.out.println(texto.startsWith("Mundo")); // false

        String dominio = "jose@gmail.com";
        // endsWith comprueba si una cadena termina por un texto
        // Comprobar si el dominio termina en ".com"
        System.out.println(dominio.endsWith(".com")); // true

        // RECOMENDABLE SABERLO, PERO NO OBLIGATORIO
        // split permite dividir en una cadena en una expresión regular que se indique para transformarla
        // a array
        String[] palabras = texto.split(" "); // Separar palabras por espacio
        System.out.println(Arrays.toString(palabras)); // ["Hola", "Mundo"]
    }
}
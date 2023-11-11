package temados;

/**
 * <a href="https://i0.wp.com/somoshackersdelaprogramacion.es/wp-content/uploads/2022/05/java-reference-value.gif?resize=500%2C241&ssl=1">Ver enlace para más ayuda</a>
 */
public class ParametroValorYParametroReferencia {
    static void modificarValor(int numero) {
        // Cuando se pasa un parámetro por valor (solo ocurre con los tipos de datos primitivos como int),
        // lo que hace el parámetro es una copia del valor que tiene num, es decir, que numero = 7. Por
        // ello, si se modifica el valor del parametro internamente, no se va a modificar el valor original,
        // que es la variable num
        numero = 5;
    }

    static void modificarValor(StringBuffer parametro) {
        // Cuando se pasa un parámetro por referencia (solo se aplica a objetos, excepto todas las
        // clases que sean inmutables, como las clases wrapper, String incluido o LocalDate, etc...),
        // lo que ocurre es que el parámetro no copia el valor como hace si se pasa un int, sino que copia
        // la dirección de memoria, de forma que modifica el objeto original que se le ha pasado por parámetro.
        // Por ejemplo, si se crea un StringBuffer con valor "Hola Mundo" y se pasa por parámetro, y dentro
        // del método se modifica el valor del StringBuffer, también se cambia en la variable original,
        // quedando en este ejemplo "Hola MundoAdiós", ya que lo que se copia en el parámetro no es el valor
        // "Hola Mundo", sino a la dirección de memoria del objeto, de manera que modifica la misma dirección
        // de memoria
        parametro.append("Adiós");
    }

    public static void main(String[] args) {
        // Parámetro por valor
        int num = 7; // Creo una variable número con valor 7
        modificarValor(num);
        System.out.println(num); // 7

        StringBuffer stringBuffer = new StringBuffer("Hola Mundo"); // Hola Mundo
        modificarValor(stringBuffer);
        System.out.println(stringBuffer); // Hola MundoAdiós
    }
}
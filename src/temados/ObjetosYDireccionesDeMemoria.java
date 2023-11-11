package temados;

/**
 * En este ejemplo se verá cómo funcionan las direcciones de memoria con los objetos
 */
public class ObjetosYDireccionesDeMemoria {
    public static void main(String[] args) {
        // OJO. Esto no ocurre con objetos que sean inmutables, es decir, que jamás
        // se podrá modificar el valor original del objeto. Objetos inmutables son por ejemplo
        // todas las clases wrapper, String incluído o las fechas superiores a Java 8
        StringBuffer texto1 = new StringBuffer("Hola Mundo");
        StringBuffer texto2 = texto1; // Lo que se podría pensar que se está haciendo aquí
        // es que a texto2 se le está asignando el valor de texto1, es decir, texto2 = "Hola Mundo",
        // pero esto no es así. Lo que se está asignando en texto2 es la dirección de memoria del objeto
        // texto1

        // De forma que como ambos objetos apuntan a la misma dirección de memoria, los cambios que se realicen
        // en texto2 también se harán en texto1 y viceversa.
        texto2.append(" Añado este texto en texto1 y texto2");
        System.out.println(texto1); // Hola Mundo Añado este texto en texto1 y texto2
        System.out.println(texto2); // Hola Mundo Añado este texto en texto1 y texto2
    }
}
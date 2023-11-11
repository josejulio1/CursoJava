package temados;

/**
 * Otra clase de ejemplo que incluye ejemplos estáticos e instanciables
 */
public class Pajaro {
    // Todos los pájaros tienen alas (Pajaro.alas para acceder a la propiedad)
    private static boolean alas = true;

    // Propiedades instanciables, que solo se usan en el objeto que se crea
    private String color, especie;

    // Constructor para crear un pájaro con un color y una especie perteneciente
    public Pajaro(String color, String especie) {
        this.color = color;
        this.especie = especie;
    }

    public void piar() {
        System.out.println("¡Pío!");
    }

    // toString para mostrar información del objeto pájaro creado
    @Override
    public String toString() {
        return "Pajaro{" +
                "color='" + color + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }

    public static boolean isAlas() {
        return alas;
    }

    // Los setter permiten cambiar el valor de una propiedad. Cuando la propiedad sea estática, el método
    // también tiene que ser estático (es decir, llevar la palabra reservada static)
    public static void setAlas(boolean alas) {
        Pajaro.alas = alas;
    }

    public String getColor() {
        return color;
    }

    // Se le puede cambiar el color al pájaro
    public void setColor(String color) {
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public static void main(String[] args) {
        Pajaro piolin = new Pajaro("Amarillo", "Canario");
        System.out.println(piolin); // Pajaro{color='Amarillo', especie='Canario'}
        System.out.println(piolin.getColor()); // Amarillo
        System.out.println(Pajaro.isAlas()); // true
        piolin.setColor("Azul");
        System.out.println(piolin.getColor()); // Azul
        piolin.piar(); // ¡Pío!
    }
}

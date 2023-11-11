package temados;

/**
 * Antes de mirar la clase Coche, mira la clase {@link Persona}
 * En esta clase vamos a ver lo que son las propiedades y métodos estáticos
 */
public class Coche {
    // Las propiedades estáticas se utilizan cuando se quiere almacenar un valor a nivel de clase y no a nivel de objeto
    // Un ejemplo de propiedad normal, es la de la clase Persona, que se creó una propiedad que era nombre, en el que guarda
    // el nombre de cada objeto persona que se cree individualmente. Por ejemplo:
    // Persona carlos = new Persona("Carlos", "Pérez"); // Nombre -> Carlos
    // Persona joaquin = new Persona("Joaquín", "Rodríguez"); // Nombre -> Joaquín
    // En el caso de las propiedades estáticas, no están asociadas a ningún objeto, sino en la clase donde se crea
    // Eso quiere decir que no tenemos que crear un objeto para poder usar la propiedad o el método. Un ejemplo de propiedad estática,
    // puede ser la constante PI de la clase Math, en el que para usarlo, no necesitamos hacer una instancia de la clase Math mediante
    // Math objetoMath = new Math() y después hacemos objetoMath.PI, sino que se usa directamente la clase, usando Math.PI.
    // Por ejemplo, imaginemos que necesitamos guardar el número de coches que se fabrican (es decir, cuando creamos o
    // instanciamos un objeto con new Coche())
    private static int numCochesFabricados; // Para ello, hay que crear una propiedad estática que es la que va a guardar el número de coches
    // que hemos fabricado
    private int id; // Voy a crear una propiedad instanciable para asignar a cada coche que se crea un identificador único
    private String marca;

    public Coche(String marca) {
        this.id = ++Coche.numCochesFabricados; // Para acceder a una propiedad o método estático, se hace a través del nombre de la clase
        this.marca = marca;
    }

    // El método toString se utiliza para dar información del estado del objeto, es decir, qué valor tiene en sus
    // propiedades. Si por ejemplo creamos un objeto e intentamos hacer un System.out.println() del objeto y a la clase
    // no se le crea el método toString, se imprimirá por consola el identificador del objeto. Por ejemplo
    // Coche bmw = new Coche("BMW"); // Sin toString
    // System.out.println(bmw); // temados.Coche@6acbcfc0
    //
    // Coche bmw = new Coche("BMW"); // Si le creamos método toString a la clase
    // System.out.println(bmw); // Coche{id=1, marca='BMW'}
    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public static void main(String[] args) {
        Coche bmw = new Coche("BMW");
        System.out.println(bmw);
    }
}
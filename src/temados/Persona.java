package temados;

/**
 * En este ejemplo, voy a crear una clase Persona, que servirá de plantilla para crear
 * objetos de tipo Persona. Piensa una clase como si fuera una fábrica, aunque no siempre
 * tiene porque usarse para crear objetos, por ejemplo clase {@link Math}
 */
public class Persona {
    // Propiedades o atributos (Características) - Características de una persona que queremos guardar en nuestra aplicación
    private String nombre, apellidos;
    private int edad;

    // Constructores - Se encargan de construir un objeto nuevo. Se utilizan mediante la palabra reservada new.
    // Por ejemplo, si se quiere crear una persona con nombre y apellidos: Persona martin = new Persona("Martín", "Pérez")
    public Persona(String nombre, String ape) { // String nombre y String apellidos son parámetros para introducir información al constructor o método
        this.nombre = nombre; // La palabra reservada this sirve para hacer referencia al objeto en sí (en este caso, un objeto que se cree
        // de la clase Persona). El uso del this en este para referenciar a la propiedad nombre de la clase, que tiene el mismo nombre que el
        // parámetro, de forma que al escribir this.nombre, se hace referencia al nombre de la propiedad de la clase, y cuando se escribe
        // nombre normal, se hace referencia al parámetro, de forma que se guardará en la propiedad nombre de la clase lo que introduzca
        // el usuario por parámetro. Por ejemplo, si el usuario introduce de nombre "Martín", hará this.nombre = "Martín"
        apellidos = ape; // En caso de que el parámetro no se llame igual que la propiedad de la clase, no hace falta el uso del this,
        // ya que no hay ambigüedad, pero sí es recomendable usar el this aun así
    }

    // Se pueden crear varios constructores. A esto se le llama sobrecarga de constructores. El uso de crear varios
    // con distintos número de parámetros nos permite crear por ejemplo un objeto Persona con nombre y apellidos y que
    // la edad sea opcional, ya que puedes usar un constructor u otro
    public Persona(String nombre, String apellidos, int edad) {
        this(nombre, apellidos); // Al crear un constructor con más parámetros, es recomendable llamar al constructor anterior
        // con menos parámetros para reutilizar código. Para hacerlo, usar la palabra reservada
        // this(parámetros que tenía el constructor anterior)
        this.edad = edad;
    }

    // Métodos (Acciones) - Son funciones, solo que a las funciones se les llama métodos cuando hablamos de
    // Programación Orientada a Objetos.
    // Ejecutan un bloque de código definido dentro de las llaves {}
    // Los métodos pueden o no retornar o devolver un valor
    // Para ejecutar los métodos, hay que llamarlos (mirar en el main)
    // La estructura mínima de un método siempre es: (tipo de dato a devolver) nombre del método(puede tener o no parámetros) { (código a ejecutar) }
    public void hablar() { // Si el método usa la palabra reservada void, quiere decir que no devolverá ningún valor el método, es decir, no usará la palabra reservada return
        System.out.println("¡Hola!");
    }

    // Los métodos pueden tener ninguno o muchos parámetros, no hay límite
    public void comer(String nombreComida) { // Cuando se pasan parámetros, hay que especificar el tipo de dato de este y un nombre identificativo para el parámetro (mirar en el main el funcionamiento)
        System.out.println("Me he comido una " + nombreComida);
    }

    // Los métodos getters sirven para ÚNICAMENTE obtener el valor de una propiedad de la clase. Se recomiendan establecer siempre
    // las propiedades con el modificador de acceso en private, ya que eso hace que solo puedan ser accesibles desde la misma clase donde
    // se crean, es decir, esta. Esto se verá más en detalle en posteriores temas
    public String getNombre() { // Este método devuelve un tipo String, es decir, una cadena de texto, que se puede usar para guardar
        // en una variable, o imprimir por consola, etc...
        return nombre; // La palabra reservada return devuelve la variable. El tipo de variable que se devuelva en el return tiene que ser
        // el mismo que se especifique arriba del método
    }

    public String getApellidos() {
        return apellidos;
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Martín", "Pérez"); // Instanciar un objeto de tipo Persona con nombre
        // "Martín" y apellidos "Pérez"
        System.out.println(persona.getNombre()); // Martín
        System.out.println(persona.getApellidos()); // Pérez
        // Ejecutando el método hablar
        persona.hablar(); // ¡Hola!
        // Ejecutando un método con un parámetro
        persona.comer("Manzana"); // Me he comido una Manzana
    }
}
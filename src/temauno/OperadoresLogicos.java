package temauno;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        String nombre = "José";
        boolean esAlto = true;
        boolean contraseniaRobusta = true;

        // && -> Y o AND -> *
        // || -> O o OR -> +
        // ! sirve para negar o invertir un booleano
        boolean hizoTareas = false;
        boolean fueSupermercado = true;
        System.out.println(!(hizoTareas || fueSupermercado) && nombre.equals("José") ? "Hay caramelo" : "No hay caramelo");
        System.out.println(a <= b || b > a);
    }
}
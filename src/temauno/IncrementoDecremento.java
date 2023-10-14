package temauno;

public class IncrementoDecremento {
    public static void main(String[] args) {
        int a = 5;

        // Para incrementar o decrementar solo en 1 una variable, se puede realizar lo siguiente
        a++; // Incremento
        a--; // Decremento

        // Pre incremento/decremento -> Primero realiza la operación aritmética y después saca el valor
        System.out.println(++a); // Lo que hace es que primero suma el valor de la variable a y después
                                 // lo muestra en consola -> 6
        a = 3;
        System.out.println(--a); // 2

        a = 5;
        // Post incremento/decremento -> Primero saca el valor y después realiza la operación aritmética
        System.out.println(a++); // Lo que hace es que primero imprime el valor de a y después lo incrementa -> 5
        System.out.println(a);
        a = 7;
        System.out.println(a--);
        System.out.println(a);
    }
}
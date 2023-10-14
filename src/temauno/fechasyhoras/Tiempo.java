package temauno.fechasyhoras;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Tiempo {
    public static void main(String[] args) {
        // Guardar tiempo actual
        LocalTime tiempoActual = LocalTime.now();
        System.out.println(tiempoActual);

        // Guardar un tiempo específico
        LocalTime tiempoEspecifico = LocalTime.of(12, 0);
        System.out.println(tiempoEspecifico);

        // Guardar un tiempo por texto
        LocalTime tiempoTexto = LocalTime.parse("15:00:30.94874");
        System.out.println(tiempoTexto);

        // Guardar un tiempo por texto en un formato
        LocalTime tiempoTextoFormateado = LocalTime.parse("05, 12, 20", DateTimeFormatter.ofPattern("ss',' mm',' HH"));
        System.out.println(tiempoTextoFormateado);

        System.out.println(tiempoTextoFormateado.format(DateTimeFormatter.ofPattern("'Son las' HH 'con' mm 'y' ss 'segundos'")));
    }
}
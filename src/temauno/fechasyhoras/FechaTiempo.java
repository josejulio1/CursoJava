package temauno.fechasyhoras;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechaTiempo {
    public static void main(String[] args) {
        // Guardar fecha y tiempo actual
        LocalDateTime fechaTiempoActual = LocalDateTime.now();
        System.out.println(fechaTiempoActual);

        // Guardar fecha y tiempo especificado
        LocalDateTime fechaTiempoEspecificado = LocalDateTime.of(2020, 5, 1, 3, 0);
        System.out.println(fechaTiempoEspecificado);

        // Guardar fecha y tiempo mediante un String o texto
        LocalDateTime fechaTiempoTexto = LocalDateTime.parse("2000-12-31T00:00");
        System.out.println(fechaTiempoTexto);

        // Guardar fecha y tiempo mediante un String o texto con un formato
        LocalDateTime fechaTiempoTextoFormateado = LocalDateTime.parse("1970, 01, 01 - 00:00",
                DateTimeFormatter.ofPattern("uuuu',' MM',' dd '-' HH':'mm"));
        System.out.println(fechaTiempoTextoFormateado);
    }
}
package temauno.fechasyhoras;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparacionFechasOTiempoOAmbas {
    public static void main(String[] args) {
        // El ChronoUnit se utiliza para saber la diferencia de cualquier unidad de tiempo entre dos fechas

        // Saber la diferencia en segundos entre la fecha de hoy y hace 3 días
        LocalDateTime fechaHoy = LocalDateTime.now();
        LocalDateTime fecha3Dias = fechaHoy.minusDays(3);
        System.out.println(ChronoUnit.SECONDS.between(fecha3Dias, fechaHoy));

        // A partir de tu fecha de nacimiento, indica cuántos años tienes
        LocalDate miCumpleanios = LocalDate.of(1989, 5, 15);
        System.out.println(miCumpleanios.until(LocalDate.now(), ChronoUnit.YEARS));
        System.out.println(ChronoUnit.YEARS.between(miCumpleanios, LocalDate.now()));

        // Saber la diferencia de meses entre dos edades de persona
        LocalDate fechaPersona1 = LocalDate.of(2015, 1, 9);
        LocalDate fechaPersona2 = LocalDate.of(2015, 7, 25);
        System.out.println(ChronoUnit.MONTHS.between(fechaPersona1, fechaPersona2));

        // Averigua cuántas horas ha trabajado la siguiente persona
        LocalTime entrada = LocalTime.of(5,0);
        LocalTime salida = LocalTime.of(23,0);
        System.out.println(ChronoUnit.HOURS.between(entrada, salida));
    }
}
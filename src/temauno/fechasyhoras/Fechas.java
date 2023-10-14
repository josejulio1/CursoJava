package temauno.fechasyhoras;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Fechas {
    public static void main(String[] args) {
        // Guardar la fecha de hoy
        LocalDate fechaHoy = LocalDate.now();
        System.out.println(fechaHoy);

        // Guardar una fecha especificada
        LocalDate fecha2005 = LocalDate.of(2005, 5, 5);
        System.out.println(fecha2005);

        // Guardar una fecha escrita por texto o String (como puede ser por consola) a fecha
        LocalDate fechaPorTexto = LocalDate.parse("2010-03-01");
        System.out.println(fechaPorTexto);

        // Guardar una fecha en un formato indicado
        LocalDate fechaFormateadaPorTexto = LocalDate.parse("01 03 2005", DateTimeFormatter.ofPattern("MM dd uuuu")); // Mes, día, año
        System.out.println(fechaFormateadaPorTexto);

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("'El día de hoy es' dd 'del mes' MM 'del año' uuuu"); // El día de hoy es {dia} del {mes} del año {año}
        System.out.println(fechaHoy.format(formatoFecha));
        System.out.println("La fecha de hoy es " + fechaHoy.format(DateTimeFormatter.ofPattern("MMM"))); // Para sacar las 3 primeras letras de un mes, usar de patrón MMM
        System.out.println("La fecha de hoy es " + fechaHoy.format(DateTimeFormatter.ofPattern("MMMM"))); // Para sacar el nombre del mes entero, usar de patrón MMM

        // Formatea la fecha 2015, 3, 21 de la siguiente forma: El día es 21 de Mar. del 2015
        LocalDate fechaFormateada = LocalDate.of(2015, 3, 21);
        System.out.println(fechaFormateada.format(DateTimeFormatter.ofPattern("'El día es' dd 'de' MMM'. del' uuuu")));

        // Saber la diferencia (por ejemplo de días), entre dos fechas
        System.out.println();
        System.out.println(fecha2005.until(fechaHoy, ChronoUnit.DAYS));

        // Imprime por consola la fecha de hoy dentro de 2 semanas
        LocalDate fechaDeHoy = LocalDate.of(2024, 1, 1);
        System.out.println(fechaDeHoy.plusWeeks(2));

        // Imprime por consola la fecha anterior pero con 5 días menos
        System.out.println(fechaDeHoy.minusDays(5));

        // Obtener el día del año
        System.out.println(fechaDeHoy.getDayOfYear());

        // Obtener el día de hoy
        System.out.println(fechaDeHoy.getDayOfMonth());

        // Obtener día de la semana
        System.out.println(fechaDeHoy.getDayOfWeek());

        // Obtener el mes de una fecha
        System.out.println(fechaDeHoy.getMonth());

        // Saber si una fecha está después de otra
        System.out.println(fechaDeHoy.isAfter(fecha2005)); // true

        // Saber si una fecha va antes que otra
        System.out.println(fechaDeHoy.isBefore(fecha2005)); // false

        // Obtener el número de días del mes
        System.out.println(fechaDeHoy.lengthOfMonth());

        // Obtener el número de días del año
        System.out.println(fechaDeHoy.lengthOfYear());

        // Saber si un año es bisiesto o no
        System.out.println(fechaDeHoy.isLeapYear());
        // o
        System.out.println(fechaDeHoy.lengthOfYear() == 366 ? "Es bisiesto" : "No es bisiesto");
        // o
        System.out.println(fechaDeHoy.getYear() % 4 == 0);
    }
}
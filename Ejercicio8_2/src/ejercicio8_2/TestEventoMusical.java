
package ejercicio8_2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestEventoMusical {
    public static void main(String[] args) {
        EventoMusical evento = new EventoMusical(
            "Festival de Jazz",
            LocalDate.of(2025, 7, 15),
            new BigDecimal("125000.75"),
            GeneroMusical.JAZZ
        );

        evento.agregarArtista(new Artista("Alejandro Gonzalez"));
        evento.agregarArtista(new Artista("David Sanchez"));

        System.out.println(evento);
    }
}

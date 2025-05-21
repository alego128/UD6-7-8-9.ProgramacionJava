package ejercicio8_3;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestEventoMusical {
    public static void main(String[] args) {
        EventoMusical evento1 = new EventoMusical(
            "Festival de Jazz",
            LocalDate.of(2025, 7, 15),
            new BigDecimal("125000.75"),
            GeneroMusical.JAZZ
        );

        EventoMusical evento2 = new EventoMusical(
            "Rock en el Parque",
            LocalDate.of(2025, 8, 10),
            new BigDecimal("95000.50"),
            GeneroMusical.ROCK
        );

        evento1.agregarArtista(new Artista("Miles Davis"));
        evento2.agregarArtista(new Artista("AC/DC"));

        evento1.setControl(5); 
        evento2.setControl(3);

        System.out.println(evento1);
        System.out.println(evento2);
    }
}

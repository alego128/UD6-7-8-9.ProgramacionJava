
package ejercicio8_1;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestEventoMusical {
    public static void main(String[] args) {
        EventoMusical evento = new EventoMusical(
            "Festival de Jazz",
            LocalDate.of(2025, 7, 15),
            new BigDecimal("125000.75")
        );

        System.out.println(evento);
    }
}

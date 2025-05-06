
package ejercicio6_4;

/**
 *
 * @author Alego
 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio6_4 {

    static List<Integer> lista = new ArrayList<>();

    public static void agregarNumero(int numero) throws IllegalArgumentException {
        if (lista.contains(numero)) {

            throw new IllegalArgumentException("El numero " + numero + " ya existe en la lista");
        }
        lista.add(numero);
        System.out.println("Numero añadido: " + numero);
    }

    public static void main(String[] args) {
        try {
            agregarNumero(10);
            agregarNumero(20);
            agregarNumero(10); 

        } catch (IllegalArgumentException e) {

            System.out.println("Excepcion capturada: " + e.getMessage());
        }

        System.out.println("Fin del programa");
    }
}

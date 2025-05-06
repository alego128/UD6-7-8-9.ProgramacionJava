
package ejercicio6_3;

import java.util.Scanner;

/**
 *
 * @author Alego
 */
public class Ejercicio6_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce la edad de la persona: ");
            int edad = Integer.parseInt(scanner.nextLine());

            // Lanzar excepción si la edad es negativa
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser menor que 0");
            }

            System.out.println("Edad valida: " + edad);

        } catch (IllegalArgumentException e) {
            // Captura la excepción lanzada manualmente
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            // Captura cualquier otra excepción, como si no se introduce un número
            System.out.println("Entrada invalida: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Programa finalizado");
        }
    }
}

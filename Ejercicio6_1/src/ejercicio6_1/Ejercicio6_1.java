
package ejercicio6_1;

import java.util.Scanner;

/**
 *
 * @author Alego
 */
public class Ejercicio6_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comienza programa división");

        try {
            // Pedimos valores al usuario
            System.out.print("Introduce el dividendo: ");
            int dividendo = Integer.parseInt(scanner.nextLine());

            System.out.print("Introduce el divisor: ");
            int divisor = Integer.parseInt(scanner.nextLine());

            // Aquí podría lanzarse ArithmeticException si el divisor es 0
            System.out.println("Resultado: " + dividendo / divisor);

        } catch (ArithmeticException e) {
            // Muestra el mensaje específico de la excepción
            System.out.println("Excepción: " + e.getMessage());

            // Muestra la traza completa del error
            e.printStackTrace();

        } catch (Exception e) {
            // Captura cualquier otra excepción (como NumberFormatException si se introducen letras)
            System.out.println("Otra excepción capturada: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Este bloque SIEMPRE se ejecuta, sin importar si hubo error o no
            System.out.println("Fin del programa");
            scanner.close(); // Cerramos el flujo aquí
        }

        System.out.println("¿Se ejecuta?");

        /*
         * Preguntas:
         *
         * ¿Qué pasa si el usuario introduce letras en vez de números?
         * → Se lanza una NumberFormatException, que es capturada por el catch(Exception e).
         *
         * ¿Se ejecutará ahora la línea 15 ("¿Se ejecuta?")?
         * → Sí, siempre se ejecuta después del try-catch-finally, salvo que se use System.exit() o haya error grave.
         *
         * ¿Y la línea del finally?
         * → También se ejecuta SIEMPRE, incluso si hay excepción.
         *
         * ¿Puedes capturar java.lang.Exception antes que ArithmeticException?
         * → No es recomendable. Si lo haces así:
         *   catch (Exception e) { ... }
         *   catch (ArithmeticException e) { ... }
         *   → El segundo catch (ArithmeticException) nunca se ejecutará porque ya fue capturada por Exception (es más general).
         *   → Siempre se debe capturar primero la excepción más específica y luego las más generales.
         */
    }
}
 
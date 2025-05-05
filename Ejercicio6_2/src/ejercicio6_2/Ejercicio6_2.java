package ejercicio6_2;

import java.util.Scanner;

public class Ejercicio6_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        double num1 = 0, num2 = 0;
        int num = 0;

        do {
            System.out.println("--- Calculadora Avanzada ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Logaritmo");
            System.out.println("8. Factorial");
            System.out.println("9. Seno");
            System.out.println("10. Coseno");
            System.out.println("11. Tangente");
            System.out.println("12. Valor absoluto");
            System.out.println("13. Conversión de Grados a Radianes");
            System.out.println("14. Números primos");
            System.out.println("15. Tabla de multiplicar");
            System.out.println("16. Número mayor");
            System.out.println("17. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 5 || opcion == 16) {
                System.out.print("Introduce el primer numero: ");
                num1 = sc.nextDouble();
                System.out.print("Introduce el segundo numero: ");
                num2 = sc.nextDouble();
            } else if (opcion >= 6 && opcion <= 14) {
                System.out.print("Introduce el numero: ");
                num = sc.nextInt();
            }

            switch (opcion) {
                case 1:
                    sumar(num1, num2);
                    break;
                case 2:
                    restar(num1, num2);
                    break;
                case 3:
                    multiplicar(num1, num2);
                    break;
                case 4:
                    try {
                        double resultado = dividir(num1, num2);
                        System.out.println("El resultado de la division es: " + resultado);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    potencia(num1, num2);
                    break;
                case 6:
                    raizCuadrada(num);
                    break;
                case 7:
                    logaritmo(num);
                    break;
                case 8:
                    factorial(num);
                    break;
                case 9:
                    seno(num);
                    break;
                case 10:
                    coseno(num);
                    break;
                case 11:
                    tangente(num);
                    break;
                case 12:
                    valorAbsoluto(num);
                    break;
                case 13:
                    gradosARadianes(num);
                    break;
                case 14:
                    esPrimo(num);
                    break;
                case 15:
                    tablaDeMultiplicar(num);
                    break;
                case 16:
                    numeroMayor(num1, num2);
                    break;
                case 17:
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, selecciona una opcion correcta.");
            }
        } while (opcion != 17);
    }

    public static void sumar(double num1, double num2) {
        System.out.println("El resultado de la suma es: " + (num1 + num2));
    }

    public static void restar(double num1, double num2) {
        System.out.println("El resultado de la resta es: " + (num1 - num2));
    }

    public static void multiplicar(double num1, double num2) {
        System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
    }

    // Método modificado para lanzar una excepción
    public static double dividir(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return num1 / num2;
    }

    public static void potencia(double base, double exponente) {
        System.out.println("El resultado de la potencia es: " + Math.pow(base, exponente));
    }

    public static void raizCuadrada(double num) {
        if (num < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
        } else {
            System.out.println("La raíz cuadrada de " + num + " es: " + Math.sqrt(num));
        }
    }

    public static void logaritmo(double num) {
        if (num <= 0) {
            System.out.println("El logaritmo solo está definido para números mayores que cero.");
        } else {
            System.out.println("El logaritmo de " + num + " es: " + Math.log(num));
        }
    }

    public static void factorial(int num) {
        if (num < 0) {
            System.out.println("El factorial solo está definido para números enteros no negativos.");
        } else {
            long resultado = 1;
            for (int i = 1; i <= num; i++) {
                resultado *= i;
            }
            System.out.println("El factorial de " + num + " es: " + resultado);
        }
    }

    public static void seno(int grados) {
        double radianes = Math.toRadians(grados);
        System.out.println("El seno de " + grados + " grados es: " + Math.sin(radianes));
    }

    public static void coseno(int grados) {
        double radianes = Math.toRadians(grados);
        System.out.println("El coseno de " + grados + " grados es: " + Math.cos(radianes));
    }

    public static void tangente(int grados) {
        double radianes = Math.toRadians(grados);
        System.out.println("La tangente de " + grados + " grados es: " + Math.tan(radianes));
    }

    public static void valorAbsoluto(int num) {
        System.out.println("El valor absoluto de " + num + " es: " + Math.abs(num));
    }

    public static void gradosARadianes(int grados) {
        System.out.println(grados + " grados es igual a " + Math.toRadians(grados) + " radianes.");
    }

    public static boolean esPrimo(int num) {
        boolean esPrimo = true;
        if (num < 2) {
            esPrimo = false;
        } else {
            for (int m = 2; m <= Math.sqrt(num); m++) {
                if (num % m == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("El número " + num + " es un número primo.");
        } else {
            System.out.println("El número " + num + " no es un número primo.");
        }

        return esPrimo;
    }

    public static void numeroMayor(double numero1, double numero2) {
        double mayor = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("El mayor de los dos números es: " + mayor);
    }

    public static void tablaDeMultiplicar(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

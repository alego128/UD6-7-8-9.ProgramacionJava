
package ejercicio7_1;

import java.io.IOException;

public class Ejercicio7_1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Introduce 4 caracteres (uno seguido del otro):");

        char c1= (char) System.in.read(); 
        char c2 = (char) System.in.read(); 
        char c3 = (char) System.in.read(); 
        char c4 = (char) System.in.read();

        System.out.write(c1);
        System.out.write('\n');

        System.out.print((char) c2);
        System.out.print('\n'); 

        System.out.println((char) c3);
        System.out.print('\n'); 

        System.out.printf("%c\n", c4);
    }
}

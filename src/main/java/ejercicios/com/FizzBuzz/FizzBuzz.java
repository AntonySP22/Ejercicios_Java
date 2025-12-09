package ejercicios.com.FizzBuzz;

public class FizzBuzz {
    public static void main() {

        //Fizz Buzz

        //Imprimir numeros de 1 al 100
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            } else {
                System.out.println(i);
            }

            /**
             * Review
             *
             * Pude haber usado una variable para guardar
             * que es lo que se imprimia Fizz, Buzz, FizzBuzz.
             *
             * String mensaje = "";
             *
             *             // Lógica de negocio
             *             if (i % 3 == 0 && i % 5 == 0) {
             *                 mensaje = "FizzBuzz";
             *             } else if (i % 3 == 0) {
             *                 mensaje = "Fizz";
             *             } else if (i % 5 == 0) {
             *                 mensaje = "Buzz";
             *             } else {
             *                 // Truco: Convertimos el número int a String
             *                 mensaje = String.valueOf(i);
             *             }
             *
             *             // 4. UN SOLO punto de salida (Output)
             *             System.out.println(mensaje);
             */
        }
    }
}

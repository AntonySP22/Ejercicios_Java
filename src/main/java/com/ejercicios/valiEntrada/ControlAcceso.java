package com.ejercicios.valiEntrada;

import java.util.Scanner;

public class ControlAcceso {
    public static void main(String[] agrs) {

        Scanner read = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("--------- Bienvenido a la Fiesta ---------");
        System.out.println("------------------------------------------");

        System.out.println("");
        System.out.println("Antes de continuar me podrias dar tu nombre: ");
        String nombre = read.nextLine();
        System.out.println("Un dato más, que edad tienes?");
        int edad = read.nextInt();
        if (edad < 0) {
            System.out.println("La edad no puede ser negativa,\ningrese su edad nuevamente");
            edad = read.nextInt();
        }
        System.out.println("Perfecto " + nombre + " algo más,\nde cuanto es tu presupuesto para hoy");
        Double presupuesto = read.nextDouble();
        if (presupuesto < 0) {
            System.out.println("El presupuesto no puede ser negativa,\n ngrese su presupuesto nuevamente");
            presupuesto = read.nextDouble();
        }

        //Validaciones

        if (edad < 18) {
            System.out.println("Losiento " + nombre + ", no puedes pasar, eres menor de edad");
        } else if (edad >= 18 && presupuesto >= 20.50) {
            System.out.println("¡Bienvenido/a " + nombre + "! Disfruta la fiesta.");
        } else {
            System.out.println("Lo siento " + nombre + ", fondos insuficientes");
        }


        /**
         * Review de la IA
         * package com.ejercicios.valientrada; // Paquetes siempre en minúsculas
         *
         * import java.util.Scanner;
         *
         * public class ControlAcceso {
         *     public static void main(String[] args) {
         *         Scanner scanner = new Scanner(System.in); // Nombres de variables en inglés es estándar
         *
         *         System.out.println("=== SISTEMA DE CONTROL DE ACCESO ===");
         *
         *         // 1. Lectura de Texto (Seguro hacerlo al principio o limpiar buffer después)
         *         System.out.print("Ingrese su nombre: ");
         *         String nombre = scanner.nextLine();
         *
         *         // 2. Validación Robusta con DO-WHILE
         *         int edad = -1;
         *         do {
         *             System.out.print("Ingrese su edad: ");
         *             while (!scanner.hasNextInt()) { // Evita que explote si escriben "veinte"
         *                 System.out.println("¡Eso no es un número!");
         *                 scanner.next(); // Limpia la entrada basura
         *             }
         *             edad = scanner.nextInt();
         *             if (edad < 0) System.out.println("Error: La edad no puede ser negativa.");
         *         } while (edad < 0);
         *
         *         // 3. Validación Robusta de Dinero
         *         double presupuesto = -1; // double primitivo
         *         do {
         *             System.out.print("Ingrese su presupuesto: ");
         *             while (!scanner.hasNextDouble()) {
         *                 System.out.println("Formato incorrecto. Use números.");
         *                 scanner.next();
         *             }
         *             presupuesto = scanner.nextDouble();
         *             if (presupuesto < 0) System.out.println("Error: Sin dinero no hay fiesta.");
         *         } while (presupuesto < 0);
         *
         *         // Lógica de Negocio
         *         if (edad < 18) {
         *             System.out.println("⛔ Acceso denegado " + nombre + ". Menor de edad.");
         *         } else if (presupuesto >= 20.50) {
         *             System.out.println("✅ ¡Bienvenido VIP " + nombre + "!");
         *         } else {
         *             System.out.println("⚠️ Acceso denegado " + nombre + ". Fondos insuficientes.");
         *         }
         *
         *         // CRÍTICO: Cerrar recursos
         *         scanner.close();
         *     }
         * }
         */
    }
}

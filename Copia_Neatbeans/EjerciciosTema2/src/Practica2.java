
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hecaji958
 */
public class Practica2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, h;
        int op;
        op = Interfaz();
        System.out.println("Escriba un radio: ");
        r = operador(sc);
        do {
            op = Interfaz();
            switch (op) {
                case 1, 2, 3, 4, 5, 6 -> {
                    calculadora(r, op);
                }
                case 7 -> {
                    System.out.println("Escriba un nuevo radio");
                    r = operador(sc);
                }
                case 8 -> {
                    System.out.println("Has salido del programa");
                }
                default -> {
                    System.out.println("Escribe un número válido: ");
                }
            }
        } while (op != 8);
    }

    static int Interfaz() {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(
                        "Menú De cálculos de figuras circulares:\n"
                        + "1. Longitud de la circunferencia\n"
                        + "2. Área del círculo\n"
                        + "3. Área de la esfera\n"
                        + "4. Área del cilindro\n"
                        + "5. Volumen de la esfera\n"
                        + "6. Volumen del cilindro\n"
                        + "7. Nuevo radio\n"
                        + "8. Terminar\n"
                        + "Elija una opción: ");
                op = sc.nextInt();
                valido = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Escriba una opción válida: ");
                sc.nextLine();
            }
        }
        return op;
    }

    static double calculadora(int r, int op) {
        Scanner sc = new Scanner(System.in);
        int h;
        double resultado = 0;
        switch (op) {
            case 1 -> {
                resultado = 2 * Math.PI * r;
                System.out.println("La longitud de la circunferencia es " + resultado);
            }
            case 2 -> {
                resultado = Math.PI * Math.pow(r, 2);
                System.out.println("El área del circulo es " + resultado);
            }
            case 3 -> {
                resultado = 4 * Math.PI * Math.pow(r, 2);
                System.out.println("El área de la esfera es " + resultado);
            }
            case 4 -> {
                System.out.println("Escriba una altura: ");
                h = operador(sc);
                resultado = 2 * Math.PI * r * (r + h);
                System.out.println("El área del cilindro es " + resultado);
            }
            case 5 -> {
                resultado = (4 / 3) * Math.PI * Math.pow(r, 3);
                System.out.println("El volumen del esfera es " + resultado);
            }
            case 6 -> {
                System.out.println("Escriba una altura: ");
                h = operador(sc);
                resultado = Math.PI * h * Math.pow(r, 2);
                System.out.println("El volumen de la cilindro es " + resultado);
            }
        }
        return resultado;
    }

    static int operador(Scanner sc) {
        int opr = 0;
        boolean valido = false;
        while (!valido) {
            try {
                opr = sc.nextInt();
                if (opr < 0) {
                    throw new IllegalArgumentException("Ponga un número positivo");
                }
                valido = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("ERROR!!!\nEscriba un valor valido");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + "");
            }
        }
        return opr;
    }
}

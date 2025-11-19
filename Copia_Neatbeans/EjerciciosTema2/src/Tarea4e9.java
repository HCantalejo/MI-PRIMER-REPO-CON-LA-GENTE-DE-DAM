
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea4e9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Escriba un número: ");
        int numero = sc.nextInt();
        long resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }

    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

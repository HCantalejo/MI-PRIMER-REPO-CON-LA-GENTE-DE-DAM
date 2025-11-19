
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea211 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriba un numero del 1 al 7: ");
        int dia = sc.nextInt();
        switch (dia) {
            case 1 ->System.out.println("Lunes");
            case 2 ->System.out.println("Martes");
            case 3 ->System.out.println("Miercoles");
            case 4 ->System.out.println("Jueves");
            case 5 ->System.out.println("Viernes");
            case 6 ->System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
        }
    }
}

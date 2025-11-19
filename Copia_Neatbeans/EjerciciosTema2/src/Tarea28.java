
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea28 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a,b,c;
        double x1,x2,d;
        System.out.println("Introduzca primer componente: ");
        a =sc.nextDouble();
        System.out.println("Introduzca segundo componente: ");
        b =sc.nextDouble();
        System.out.println("Introduzca tercer componente: ");
        c =sc.nextDouble();
        d=(b*b-4*a*c);
        if (d<0){
            System.out.println("No existen soluciones reales");
        } else if (a == 0){
            System.out.println("No es una ecuacion de 2* grado");
         } else {
            x1= (-b + Math.sqrt(d)) / (2*a);
            x2= (-b - Math.sqrt(d))/(2*a);
            System.out.println("Solucion 1: "+x1);
            System.out.println("Solucion 2: "+ x2);
        }
    }
}

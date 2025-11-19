
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea23 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int num1 = sc.nextInt();
        System.out.println("Escriba otro numero: ");
        int num2 = sc.nextInt();
        if (num1>num2){
          System.out.println(num1 + " es mayor que " + num2);
        }
        else{
         System.out.println(num2 + " es mayor que " + num1);
          }
    }
}

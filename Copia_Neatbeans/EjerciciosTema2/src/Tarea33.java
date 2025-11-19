
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea33 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ns=(int) (Math.random()*100+1);
        System.out.println("Introduzca un numero del 1 al 100: ");
        int num=sc.nextInt();
        while (ns != num && num !=-1){
            if(ns<num){
                System.out.println("Menor");   
            } else{
                System.out.println("Mayor");
            }
         System.out.println("Introduzca un numero del 1 al 100: ");
         num=sc.nextInt();
        }
        if(ns==num){
            System.out.println("Enhorabuena...");
        }else{
            System.out.println("Otra vez sera...");
        }
    }
}


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea3e19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba el numero de * que quiere usar para formar un triangulo: ");
        int n=sc.nextInt();
        for(int fila=1;fila<=n;fila++){
            for(int columna=fila;columna<=n;columna++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
   
}

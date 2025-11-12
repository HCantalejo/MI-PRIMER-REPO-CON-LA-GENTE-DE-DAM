
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea3e1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        System.out.println("Introduzca un numero positivo entero(o uno negativo para parar el programa)");
        num=sc.nextInt();
        while(num>=0){
            int sum=0;
            int i=1;
          while(i<=num){
              if(i%2 ==0){
              sum+=i;
              }
              i++;
          }
            System.out.println("La suma de los numeros pares desde 1 hasta "+num+" es: "+sum);
            System.out.println("Introduzca un numero positivo entero(o uno negativo para parar el programa)");
            num=sc.nextInt();
     }
        System.out.println("Se ha introducido un numero negativo");
        System.out.println("Fin del programa");
    }
}

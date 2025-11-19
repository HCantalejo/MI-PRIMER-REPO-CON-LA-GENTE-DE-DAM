
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Prueba48 {
    static double calculadora(double a,double b,int operación){
        double resultado;
        switch(operación){
            case 1->
                resultado=a+b;
            case 2->
                resultado=a-b;
            case 3->
                resultado=a*b;
            case 4->
                resultado=a/b;
            default->{
                System.out.println("No es una operacion valida");
                resultado= 0;
            }
        }
      return resultado;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        double n1=sc.nextDouble();
        System.out.println("Escribe un numero: ");
        double n2=sc.nextDouble();
        System.out.println("Escriba lo que quiere hacer(1 suma,2 resta,3 multiplicacion,4 division): ");
        int op=sc.nextInt();
        System.out.println("El resultado de la operacion que ha elegido es: "+calculadora(n1,n2,op));
    }
}


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea3e3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num3,op;
        System.out.println("Escriba un numero: ");
        int num1=sc.nextInt();
        System.out.println("Escriba otro numero: ");
        int num2=sc.nextInt();
        System.out.println("Diga si quiere sumar(1),restar(2) o multiplicar(3): ");
        op=sc.nextInt();
        switch(op){
        case 1->{
            num3=num1+num2;
            System.out.println("La operacion es: "+num3);
        }
        case 2->{
            num3=num1-num2;
            System.out.println("La operacion es: "+num3);
        }case 3 ->
        {
            num3=num1*num2;
            System.out.println("La operacion es: "+num3);
        }
        }
        if(op>=4){
            System.out.println("Operacion invalida");
        }
    }
}

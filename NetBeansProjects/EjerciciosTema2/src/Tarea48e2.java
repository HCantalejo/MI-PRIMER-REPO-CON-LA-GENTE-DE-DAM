
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea48e2 {
    static double calculadora(double a,double b,int operacion){
        double resultado;
        switch(operacion){
            case 1->
                resultado=a+b;  
            case 2->
                resultado=a-b;
            case 3->
                resultado=a*b;
            case 4->
            {if(b!=0){
                     resultado=a/b;
                }else {
                System.out.println("No se puede dividir entre 0.");
                    resultado = 0;
            }
            }
            default->resultado = 0;
        }
            
              return resultado;
    }
        static int menu(){
            Scanner sc=new Scanner(System.in);
            System.out.println("CALCULADORA BÁSICA DE NÚMEROS REALES \n");
            System.out.println("Menú de operaciones:");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicación");
            System.out.println("4.División");
            System.out.println("5.Salir del programa");
            System.out.println("Elige una opción: ");
                       int op=sc.nextInt();
                        return op;
            }
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n1,n2;
        int op;
        do{
            op=menu();

                switch(op){
                    case 1,2,3,4->{
                        System.out.println("Escribe un número: ");
                        n1=sc.nextDouble();
                        System.out.println("Escribe otro número: ");
                        n2=sc.nextDouble();
                        System.out.println("El resultado de la operacion que ha elegido es: "+calculadora(n1,n2,op)+"\n");
                        }
                    case 5->{
                        System.out.println("Has salido del programa\n");
                        }
                    default->{
                        System.out.println("ERROR,escriba una opción válida\n");   
                        }
                }
        } while(op!=5);
    }
}
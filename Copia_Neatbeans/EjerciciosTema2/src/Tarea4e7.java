
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea4e7 {
        static double calculadora(double r,int operacion){
        double resultado=0,h=0;
        Scanner sc=new Scanner(System.in);
        switch(operacion){
            case 1->
            {
                resultado=2 * Math.PI * r;
            }   
            case 2->
            {
                resultado=Math.PI * Math.pow(r, 2);
            }    
            case 3->
            {
                resultado=4 * Math.PI * Math.pow(r, 2);
            }
            case 4->
            {
                System.out.println("Escribe la altura: ");
                h=sc.nextDouble();
                resultado=2 * Math.PI * r * (h + r);
            }
            case 5 -> {
                resultado=(4.0 / 3.0) * Math.PI * Math.pow(r, 3);
            }
            case 6 ->{
                System.out.println("Escribe la altura: ");
                h=sc.nextDouble();
                 resultado=(Math.PI * Math.pow(r, 2) * h);
            }
            case 7 ->
            {
                r=sc.nextDouble();
            }
            default->resultado = 0;
        }
            
              return resultado;
    }
        static int menu(){
            Scanner sc=new Scanner(System.in);
            System.out.println("CALCULADORA BÁSICA DE LONGITUDES,AREAS Y VOLÚMENES \n");
            System.out.println("Menú de operaciones:");
            System.out.println("1.Longitud de la circunferencia");
            System.out.println("2.Área del circulo");
            System.out.println("3.Área de la esfera");
            System.out.println("4.Área del cilindro");
            System.out.println("5.Volumen de la esfera");
            System.out.println("6.Volumen del cilindro");
            System.out.println("7.Nuevo radio");
            System.out.println("8.Terminar");         
            System.out.println("Elige una opción: ");
                       int op=sc.nextInt();
                        return op;
            }
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n1;
        int op;
        do{
            op=menu();

                switch(op){
                    case 1,2,3,4,5,6,7->{
                        System.out.println("Escribe un radio: ");
                        n1=sc.nextDouble();
                       System.out.println("El resultado de la operacion que ha elegido es: "+calculadora(n1,op)+"\n");
                        }
                    case 8->{
                        System.out.println("Has salido del programa\n");
                        }
                    default->{
                        System.out.println("ERROR,escriba una opción válida\n");   
                        }
                }
        } while(op!=8);
    }
}


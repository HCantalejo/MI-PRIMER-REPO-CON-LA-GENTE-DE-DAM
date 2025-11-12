
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Practica1 {
//  Esta es la función principal
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double n1,n2;
    int op;
    do{
        op=Interfaz();

                switch(op){
                    case 1,2,3->{
                        System.out.println("Escriba un número: ");
                        n1=leenum(sc);
                        System.out.println("Escriba otro número: ");
                        n2=leenum(sc);
                        System.out.println("El resultado de la operación es: "+resultado(n1,n2,op));
                    }
                    case 4->{
                        System.out.println("Escriba un número: ");
                        n1=leenum(sc);
                        System.out.println("Escriba otro número: ");
                        n2=División0(sc);
                        System.out.println("El resultado de la operación es: "+resultado(n1,n2,op));
                    }
                    case 5 -> System.out.println("Se ha cerrado el programa");
                    default-> System.out.println("Introduzca un número válido");
                }
        }while(op!=5);
    }
//  Esta es la función Interfaz que nos deja ver el menú cuantas veces queramos
    static int Interfaz(){
        Scanner sc=new Scanner(System.in);
        int op=0;
        boolean valido=false;
        while(!valido){   
            try{
                    System.out.println("Menú de operaciones");
                    System.out.println("1.Suma");
                    System.out.println("2.Resta");
                    System.out.println("3.Multiplicación");
                    System.out.println("4.División");
                    System.out.println("5.Salir");
                    System.out.println("Elija una opción: ");
                    op=sc.nextInt();
                    valido=true;
                }catch(java.util.InputMismatchException e){
                    System.out.println("ERROR!!\nEscriba una opción o número correcto: ");
                    sc.nextLine();
            }
        }
        return op;
    }
//  Esta es la función resultado que calcula las operaciones de cada uno de las opciones posibles
    static double resultado(double n1,double n2,int op){
        double resultado=0;
        switch(op){
            case 1-> resultado=n1+n2;
            case 2 -> resultado=n1-n2;
            case 3 -> resultado=n1*n2;
            case 4 -> resultado=n1/n2;
        }
        return resultado;
    }
// Esta es la función División0 que restringe tanto dividir entre 0 como poner letras en el segundo valor
    static double División0(Scanner sc){
        double n2=1;
        boolean valido=false;
        while(!valido){
            try{
                n2=sc.nextDouble();
                if(n2==0){
                    throw new IllegalArgumentException("No se puede dividir entre 0!!!");
                }
                valido=true;
                }catch (java.util.InputMismatchException e){
                    System.out.println("ERROR!!\nEscriba otro número: ");
                    sc.nextLine();
                }catch(IllegalArgumentException e){
                    System.out.println(e.getMessage()+"\nEscriba un número que no sea igual a 0: ");
                    sc.nextLine();
                }
        }
        return n2;
    }

//Esta es la función num2 que restringe poner letras en el segundo valor    
        static double leenum(Scanner sc){
        double n=0;
        boolean valido=false;
        while(!valido){
        try{
            n=sc.nextDouble();
            valido=true;
        }catch (java.util.InputMismatchException e){
            System.out.println("ERROR!!\nEscriba otro número: ");
            sc.nextLine();
            }
        }
    return n;
    }
}
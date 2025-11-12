/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea4e9;

import java.util.Scanner;

/**
 *
 * @author hecaji958
 */
public class EjerciciosS1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int resultado;
        System.out.println("Escriba un número entero: ");
        int n1=LeerNúmero(sc);
        System.out.println("Escriba otro número entero: ");
        int n2=LeerNúmero(sc);
        resultado=n1+n2;
        System.out.println("El resultado de la suma es: "+resultado);
    }
    static int LeerNúmero(Scanner sc){
        boolean valido=false;
        int n=0;
        while(!valido){
            try{
                n=sc.nextInt();
                valido=true;
            }catch(java.util.InputMismatchException e){
                System.out.println("ERROR!!"+"\nEscriba un número entero");
                sc.nextLine();
            }
        }
        return n;
    }
}

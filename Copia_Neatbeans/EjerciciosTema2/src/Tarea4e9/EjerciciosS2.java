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
public class EjerciciosS2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int n=LeerNúmero(sc);
        System.out.println("El factorial de su número es: "+factorial(n));
    }
    static int LeerNúmero(Scanner sc){
        boolean valido=false;
        int n=0;
        while(!valido){
            try{
                n=sc.nextInt();
                if(n<0){
                    throw new IllegalArgumentException("El número debe ser positivo");
                }
                valido=true;
            }catch(java.util.InputMismatchException e){
                System.out.println("ERROR!!"+"\nEscriba un número entero");
                sc.nextLine();
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage()+".Escriba un número entero: ");
            }
        }
        return n;
    }
    static int factorial(int n){
        int resultado=1;
        for(int i=1;i<=n;i++){
            resultado =resultado*i;
        }
        return resultado;
    }
}

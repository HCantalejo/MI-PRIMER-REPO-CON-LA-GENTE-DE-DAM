
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Prueba44 {
    static int Suma(int a,int b){
    int resultado;
    resultado=a+b;
        System.out.println("El resultado de la suma es: "+resultado);
    return resultado;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int n1=sc.nextInt();
        System.out.println("Escriba otro numero: ");
        int n2=sc.nextInt();
        Suma(n1,n2);
    }
}

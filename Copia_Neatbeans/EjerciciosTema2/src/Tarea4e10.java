
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea4e10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int n=sc.nextInt();
        System.out.println("El resultado de la potencia del número será: "+potencia(n));
    }
    static int potencia(int n){
        int c;
        int b=1;
        do{
            c=n-1;
            b=n*b;
        }while (c!=0);
        return b;
    }
}

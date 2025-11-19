
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea2e5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,p,n;
        System.out.println("Escriba el aforo maximo del local");
        a=sc.nextInt();
        System.out.println("Escriba el precio de las entradas");
        p=sc.nextInt();
        System.out.println("Escriba el numero de entradas vendidas");
        n=sc.nextInt();
        if ((8*a)/100>n){
            System.out.println("El concierto se cancela");
        }else{
            if((50*a)/100<=n){
                p=p-((p*25)/100);
            }
            System.out.println("El precio de la entrada se rebaja un 25%,siendo este: " + p);
        }
    }
 
}

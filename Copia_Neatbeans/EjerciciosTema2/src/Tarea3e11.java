
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea3e11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int suma=0;
        double media;      
        for(int i=1;i<=10;i++){
            System.out.println("Escriba un numero: ");
            n=sc.nextInt();
            suma+=n;
        }
        media=suma/10;
        System.out.println("La media de los 10 numeros es: "+ media);
    }
}

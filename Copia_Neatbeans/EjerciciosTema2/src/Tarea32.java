
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sume=0;
        int conta=0;
        int contm=0;
        double media;
        System.out.println("Introduzca edad: ");
        int edad = sc.nextInt();
        while(edad > 0){
            sume +=edad;
            conta++;
            if(edad>=18){
                contm++;
            }
            System.out.println("Introduzca edad: ");
            edad = sc.nextInt();
        }
        media=(double) sume/conta;
        System.out.println("Suma de todas las edades "+ sume);
        System.out.println("Media: "+media);
        System.out.println("Numero total de alumnos: "+conta);
        System.out.println("Mayores de edad: "+ contm);
    }
}

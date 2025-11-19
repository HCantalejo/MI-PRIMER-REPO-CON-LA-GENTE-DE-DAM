
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea210 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        System.out.println("Escriba una nota: ");
        int nt1=sc.nextInt();
        switch (nt1) {
            case 0,1,2,3,4 ->
               System.out.println("Insuficiente");
               case 5 ->
                System.out.println("Suficiente");
               case 6 ->
                   System.out.println("Bien");
               case 7,8 ->
                   System.out.println("Notable");
               case 9,10 ->
                   System.out.println("Sobresaliente");
         }
    }
    
}

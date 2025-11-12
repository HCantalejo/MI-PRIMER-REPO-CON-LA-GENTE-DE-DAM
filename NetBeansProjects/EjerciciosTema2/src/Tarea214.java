
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea214 {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int DiasDelMes=0;
        System.out.println("Introduce dia: ");
        int d = sc.nextInt();
         System.out.println("Introduce mes: ");
        int m = sc.nextInt();
         System.out.println("Introduce anyo: ");
        int a = sc.nextInt();
        DiasDelMes = switch (m){
            case 2 -> 28;
            case 4,6,9,11 -> 30;
            default -> 31;
        };
        d++;
        if (d > DiasDelMes ){
        d = 1;
        m++;
        if (m > 12){
        m=1;
        a++;
        }
       }
        if(a == 0){
            a=1;
        }
        System.out.println(d+"/"+m+"/"+a);
        
    }
}

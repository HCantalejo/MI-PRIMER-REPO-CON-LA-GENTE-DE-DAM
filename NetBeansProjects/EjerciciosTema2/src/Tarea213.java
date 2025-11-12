
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea213 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce una hora: ");
        int h = sc.nextInt();
         System.out.println("Introduce minutos: ");
        int m = sc.nextInt();
         System.out.println("Introduce segundos: ");
        int s = sc.nextInt();
        s++;
        if (s>59){
            s=0;
            m++;
        }
        if (m>59){
        m=0;
        h++;
        }
        if (23<h){
        h=0;
        }
        System.out.println("Hora + 1 segundo: "+h+":"+m+":"+s);
    }
    
}


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea3e2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba una cuenta atras para hacer despegar al cohete: ");
        int cuenta=sc.nextInt();
        while(cuenta>0){
            cuenta--;
            System.out.println(cuenta);
        }
        if(cuenta==0){
               System.out.println("DESPEGUE!!!");
        }
    }
    
}

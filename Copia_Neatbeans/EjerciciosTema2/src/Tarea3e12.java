
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea3e12 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n;
        do{
        System.out.println("Escriba un numero del 1 al 10: ");
        n=sc.nextInt();
       }while(!(1<=n && n<=10));
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
    }
}

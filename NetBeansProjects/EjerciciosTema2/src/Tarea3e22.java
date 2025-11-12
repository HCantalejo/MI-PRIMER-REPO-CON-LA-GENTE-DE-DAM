
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea3e22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe un numero");
        int n=sc.nextInt();
        while(n>0){
            System.out.println(n%10);
            n/=10;
        }
    }
}

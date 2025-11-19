
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea3e21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba el numero de * que quiere usar para formar una piramide: ");
        int n=sc.nextInt();
        for(int h=1;h<=n;h++){
            for(int e=h;e<n ;e=e+1){
                System.out.print(" ");
            }
            for(int b=1;b<=h;b=b+1){
                System.out.print("* ");   
            }
            System.out.println("");
        }
    }
}

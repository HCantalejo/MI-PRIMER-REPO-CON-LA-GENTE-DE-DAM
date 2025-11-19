
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class NewClass1 {
    static void m(int a,int b){
        int mayor= a>b ? a:b;
        int menor= a<b ? a:b;
        for(int i=menor;i<mayor;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int n1=sc.nextInt();
        System.out.println("Escriba otro numero: ");
        int n2=sc.nextInt();
        System.out.println("Los valores comprendidos entre el numero 1 y el numero 2 son: ");
        m(n1,n2);
    }
}

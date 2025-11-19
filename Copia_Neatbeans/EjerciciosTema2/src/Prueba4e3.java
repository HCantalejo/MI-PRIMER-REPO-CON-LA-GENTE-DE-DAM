
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Prueba4e3 {
    static int max(int a,int b){
        int max;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int n1=sc.nextInt();
        System.out.println("Escriba otro numero: ");
        int n2=sc.nextInt();
        System.out.println("El numero mayor es: "+max(n1,n2));
    }
}

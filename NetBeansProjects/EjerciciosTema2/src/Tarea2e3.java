
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea2e3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba su salario: ");
        int s=sc.nextInt();
        if (s<1000){
            System.out.println("Muy Malo");
        }else {
            if(s >=1000 && s<1500){
                System.out.println("Malo");
            }
            else{
                if(s >=1500 && s < 3000){
                    System.out.println("Bueno");
                }
                else{
                    if(s>=3000){
                        System.out.println("Muy Bueno");
                    }
                }
            }
        }
    }
}

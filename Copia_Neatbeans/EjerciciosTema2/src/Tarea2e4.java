
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea2e4 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Temperatura del aula: ");
        int t=sc.nextInt();
        if (t<12){
            System.out.println("Mucho Frio");
        }else {
            if(t >=12 && t<22){
                System.out.println("Frio");
            }
            else{
                if(t >=22 && t < 32){
                    System.out.println("Calor");
                }
                else{
                    if(t>=32){
                        System.out.println("Mucho Calor");
                    }
                }
            }
        }
    }
    
}

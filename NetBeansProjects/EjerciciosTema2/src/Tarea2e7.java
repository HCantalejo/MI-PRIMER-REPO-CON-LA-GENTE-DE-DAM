
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea2e7 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int cd,na,ka,ra;
        System.out.println("Escriba la cantidad de comida diaria: ");
        cd=sc.nextInt();
        System.out.println("Escriba el numero de animales: ");
       na=sc.nextInt();
        System.out.println("Escriba los kg de comida que come cada animal: ");
        ka=sc.nextInt();
        if (cd>=ka*na){
            System.out.println("La cantidad de comida es suficiente");
        }else{
            if(cd<ka*na){
                ra=cd+(cd/(ka*na));
                System.out.println("Las raciones que le debes echar a cada animal son: " + ra + " kg por animal");
            }else{
                if(ka==0 ||na==0){
                    System.out.println("ERROR");
                }
            }
        }
    }
    
}

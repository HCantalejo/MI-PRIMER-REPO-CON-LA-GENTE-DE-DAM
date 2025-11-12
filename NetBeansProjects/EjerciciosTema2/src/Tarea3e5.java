
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea3e5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba la contrasenya de 3 digitos: ");
        int cont2=sc.nextInt();
        while (cont2 != 343){
            System.out.println("Contrasenya erronea");
            System.out.println("Vuelva a escribir la contrasenya: ");
            cont2=sc.nextInt();
        }
                if(cont2==343){
        System.out.println("Contrasenya correcta"); }
                
    }
}

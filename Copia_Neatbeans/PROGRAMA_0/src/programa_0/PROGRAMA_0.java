/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa_0;

import java.util.Scanner;

/**
 *
 * @author hecaji958
 */
public class PROGRAMA_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nota de 0 a 10");
        int numero = sc.nextInt();
        while (numero<= 0 || numero >= 10) {
            System.out.println("La nota "+ numero +" NO es correcta");
            System.out.println("Introduce nota de 0 a 10");
            numero = sc.nextInt();
        }

    }

}

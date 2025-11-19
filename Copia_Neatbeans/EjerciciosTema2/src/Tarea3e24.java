/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea3e24 {

    public static void main(String[] args) {
        int d, c;
        c = 0;
        while (c>=0) {
            d = (int) (Math.random() * 30 + 1);
            if (d == 15) {
                break;
            } else {
                if (10 <= d && d <= 20) {
                    continue;
                } else {
                    System.out.print(d + "\t");
                }
            }
            c++;
            if (c % 5 == 0) {
                System.out.println("");
            }
        }
        System.out.println("\nHa salido el numero 15");
        System.out.println("Se ha tirado el dado "+c+" veces");
    }
}

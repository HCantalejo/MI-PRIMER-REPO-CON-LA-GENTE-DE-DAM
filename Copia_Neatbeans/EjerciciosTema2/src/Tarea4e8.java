
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea4e8 {
    static double distancia(double x1,double y1,double x2,double y2){
        double x=x1-x2;
        double y=y1-y2;
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x1=0,x2=0,y1=0,y2=0;
        System.out.println("Escribe un punto: ");
        System.out.println("Coordenada x: ");
        x1:sc.nextDouble();
        System.out.println("Coordenada y: ");
        y1:sc.nextDouble();
        System.out.println("Escribe otro punto: ");
        System.out.println("Coordenada x: ");
        x2:sc.nextDouble();
        System.out.println("Coordenada y: ");
        y2:sc.nextDouble();
        System.out.println("La distancia euclidea es: "+ distancia(x1, y1, x2, y2));        
    }
}

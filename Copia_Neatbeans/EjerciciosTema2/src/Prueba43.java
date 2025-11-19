
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Prueba43 {
    static void areaVolumen(double radio,double altura,int opcion){
    double volumen,area;
    switch(opcion){
        case 1 ->{
            volumen= Math.PI*Math.pow(radio,2)*altura;
            System.out.println("El volumen del cilindro es de: "+volumen+" l");
        } 
        case 2->{
            area=2*Math.PI*radio*(altura+radio);
            System.out.println("El area del cilindro es de: "+area+"m^2");
        }
        default->{
            System.out.println("El indicador debe de ser 1 o 2,vuelva a intentarlo mas tarde.");
        }
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r,a;
        int opcion;
        System.out.println("Escribe el radio del cilindro: ");
        r=sc.nextDouble();
        System.out.println("Escribe la altura del cilindro: ");
        a=sc.nextDouble();
        System.out.println("Escribe el numero de lo que quiere calcular(1 volumen y 2 radio): ");
        opcion=sc.nextInt();
        areaVolumen(r,a,opcion);
    }
}

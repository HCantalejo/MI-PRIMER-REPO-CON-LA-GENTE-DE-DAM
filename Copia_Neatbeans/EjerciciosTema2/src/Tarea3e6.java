
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea3e6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int suma=0;
        int tirada=0;
        int dado;
        int meta= (int)(Math.random()*6)+1;
        System.out.println("El numero prohibido es: "+ meta);
        do{
            tirada++;
            System.out.println("Tirada "+tirada);
                dado=(int)(Math.random()*6)+1;
                System.out.println("Has sacado un "+dado);
                suma=suma+dado;
                System.out.println("Lleva "+ suma +" puntos");
            }while(dado!=meta);   
               System.out.println("Ha conseguido "+suma+"ptos en total");
            }
    
}

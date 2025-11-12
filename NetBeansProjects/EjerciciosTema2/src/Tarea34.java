
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea34 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int etarbmalt,altarbmalt,alt;
        int etq=0;
        System.out.println("Altura del arbol (" + etq +"):");
        alt=sc.nextInt();
        altarbmalt=alt;
        etarbmalt=0;
        while(alt !=-1){
            if(alt>altarbmalt){
                altarbmalt=alt;
                etarbmalt=etq;
            }
            etq++;
            System.out.println("Altura del arbol (" + etq +"):");
             alt=sc.nextInt();
        }
        if(altarbmalt==-1){
            System.out.println("No hay ningun arbol");
        }else{
            System.out.println("El arbol mas alto mide: "+altarbmalt);
            System.out.println("Etiqueta del arbol: "+etarbmalt);
        }
    }
}

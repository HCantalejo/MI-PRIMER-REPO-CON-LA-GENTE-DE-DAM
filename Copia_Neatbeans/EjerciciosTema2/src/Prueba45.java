
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Prueba45 {
    static boolean vocal(char c){
    boolean vocal;
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
        vocal=true;
        }else{
        vocal=false;
        }
    return vocal;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("La i es una vocal: "+vocal('i'));
        System.out.println("La m es una vocal: "+vocal('m'));
        System.out.println("La E es una vocal: "+vocal('E'));
        System.out.println("La H es una vocal: "+vocal('H'));
    }
}

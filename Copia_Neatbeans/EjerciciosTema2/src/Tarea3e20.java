/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea3e20 {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
             if (i==5) {
                 continue;
             }
             System.out.println("Tabla del "+ i);
                for(int j=1;j<=10;j++){
                    System.out.println(j+"x"+i+"="+j*i);
                }
        }
    }
}

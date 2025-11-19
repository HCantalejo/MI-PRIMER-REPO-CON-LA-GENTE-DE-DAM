/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea3e23 {
    public static void main(String[] args) {
        for(int i=1;1<=i && i<=10;i++){
            if(i%2==0){
                continue;
            }
            System.out.println("Tabla del "+i);
            for(int j=1;1<=j && j<=10;j++){
                if(j%2!=0){
                    continue;
                }
                System.out.println(i+"x"+j+"="+j*i);
            }
        }
    }
}

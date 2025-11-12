
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hecaji958
 */
public class Tarea212a {
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int dia,mes,año;
        boolean fechCo;
        System.out.println("Introduzca un dia: ");
        dia = sc.nextInt();
        System.out.println("Introduzca un mes: ");
        mes = sc.nextInt();
        System.out.println("Introduzca un anyo: ");
        año = sc.nextInt();
        if (año == 0){
        fechCo = false;
        }else {
            if (mes == 2 && (1 <= dia && dia <= 28)){
                fechCo = true;
            }else{
                if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (1 <= dia && dia <= 30)){
                  fechCo = true;
            }else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (1 <= dia && dia <= 31)){
                fechCo = true;
            }else{
               fechCo = false;
              } if(año%4==0 && año%100!=0||año%400==0 ){
                      fechCo = true;
                      }
            }
 
         }
        
        if (fechCo) {
                       System.out.println("Fecha correcta"); 
        } else{
         System.out.println("Fecha Incorrecta"); 
        }
    }
}


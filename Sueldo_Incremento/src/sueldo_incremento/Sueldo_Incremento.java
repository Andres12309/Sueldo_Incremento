/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldo_incremento;
import java.util.Scanner;
/**
 *
 * @author a
 */
public class Sueldo_Incremento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Categoria 1 incremento 15%");
        System.out.println("Categoria 2 incremento 10%");
        System.out.println("Categoria 3 incremento 8%");
        System.out.println("Categoria 4 incremento 7%");
        
        int categoria;
        double sueldo;
        double incremento;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingrese la categoria");
        categoria = lectura.nextInt();
        
        switch(categoria){
            case 1:
                incremento=0.15;
                System.out.println("Ingrese su sueldo");
                sueldo=lectura.nextFloat();
                sueldo=sueldo+(sueldo*incremento);
                System.out.println("Sue nuevo sueldo es:"+sueldo);
                break;
            case 2:
                incremento=0.10;
                System.out.println("Ingrese su sueldo");
                sueldo=lectura.nextFloat();
                sueldo=sueldo+(sueldo*incremento);
                System.out.println("Sue nuevo sueldo es:"+sueldo);
                break;
            case 3:
                incremento=0.08;
                System.out.println("Ingrese su sueldo");
                sueldo=lectura.nextFloat();
                sueldo=sueldo+(sueldo*incremento);
                System.out.println("Sue nuevo sueldo es:"+sueldo);
                break;
            case 4:
                incremento=0.07;
                System.out.println("Ingrese su sueldo");
                sueldo=lectura.nextFloat();
                sueldo=sueldo+(sueldo*incremento);
                System.out.println("Sue nuevo sueldo es:"+sueldo);
                break;
            default:
                   System.out.println("Categoria incorrecta"); 
        }
    }
    
}

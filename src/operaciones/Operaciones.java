/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        double numero1=0,  numero2=0, operacion=0;
        int opcion=0;
        System.out.println("Ingrese un numero: ");
        numero1=sc.nextDouble();
        System.out.println("Ingrese otro numero: ");
        numero2 = sc.nextDouble();
        System.out.println("Que desea hacer?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Mutiplicar");
        System.out.println("4. Dividir (primer numero entre segundo)");
        System.out.println("5. Modulo");
        opcion = sc.nextInt();
        switch(opcion){
            case 1: 
                operacion = numero1+numero2;
                System.out.println("El resultado es: "+operacion);
                break;
            case 2: 
                operacion = numero1-numero2;
                System.out.println("El resultado de la operacion es: "+operacion);
                break;
            case 3: 
                operacion = numero1*numero2;
                System.out.println("El resultado de la operacion es: "+operacion);
                break;
            case 4: 
                operacion = numero1/numero2;
                System.out.println("El resultado de la operacion es: "+operacion);
                break;
            case 5:
                operacion = numero1%numero2;
                System.out.println("El resultado de la operacion es: "+operacion);
                break;
                
        }
        
        
    }
    
}

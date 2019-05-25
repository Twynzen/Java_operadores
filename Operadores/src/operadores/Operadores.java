/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author LuisF
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2,suma,rest,mult,div,residuoo;
        
        System.out.print("Digite 2 numeros: ");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();
        
        suma = num1+num2;
        rest = num1-num2;
        mult = num1*num2;
        div = num1/num2;
        residuoo = num1%num2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+rest);
        System.out.println("La multiplicacion es: "+mult);
        System.out.println("La division es: "+div);
        System.out.println("El residuo o mod es: "+residuoo);
        
        
        
    }
    
}

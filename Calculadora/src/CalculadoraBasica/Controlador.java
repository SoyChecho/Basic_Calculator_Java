/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraBasica;

import java.util.Scanner;

/**
 *
 * @author Sergio Castro
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion = 0;
        while(opcion != 5){
            Modelo numero1 = new Modelo();
            Scanner digito1 = new Scanner(System.in);
            System.out.println("Digite el primer numero a operar: ");
            numero1.a = digito1.nextDouble();
            
            Modelo numero2 = new Modelo();
            Scanner digito2 = new Scanner(System.in);
            System.out.println("Digite el segundo numero a operar: ");
            numero2.b = digito2.nextDouble();
            
            Scanner digitar = new Scanner(System.in);
            System.out.println("Digite 1 para sumar: ");
            System.out.println("Digite 2 para restar: ");
            System.out.println("Digite 3 para multiplicar: ");
            System.out.println("Digite 4 para dividir: ");
            System.out.println("Digite 5 para apagar la calculadora: ");
            opcion = digitar.nextInt();
            switch (opcion){
                case 1: 
                    double suma = numero1.a + numero2.b;
                    System.out.println("El resultado es: "+suma);
                    break;
                case 2: double resta = numero1.a - numero2.b;
                    System.out.println("El resultado es: "+resta);
                    break;
                case 3: double multiplicacion = numero1.a * numero2.b;
                    System.out.println("El resultado es: "+multiplicacion);
                    break;
                case 4: double division = numero1.a / numero2.b;
                    System.out.println("El resultado es: "+division);
                    break;
                case 5: System.out.println("Off");
                    break;
            }
        }
        
        
    }
    
}

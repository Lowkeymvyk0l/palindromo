/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromomain;

import java.util.Scanner;

/**
 * @author Xavier
 * @author maykel 
 */
public class PalindromoMain {
public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("ingrese su texto: ");
        responder(scanner.next());
        
    }
    
    public static String QuitarEspacios(String texto){
        String espacio =  " ";
        texto = texto.replaceAll(espacio,"");
        texto = texto.toLowerCase();
        return texto;          
    }
    
    
    
    
     public static boolean EsPalindromo(String texto)
    { 
        texto = QuitarEspacios(texto);
        
        if (texto.length() <= 1)
        {
            return true;
        }
        else
        {
            if (texto.charAt(0) != texto.charAt(texto.length() - 1))
            {
                return false;
            }
            else
            { 
                // System.out.println("lo que buscas" + texto.substring(1, texto.length() - 1));
                return EsPalindromo(texto.substring(1, texto.length() - 1));
                
            }
        }
    }
    public static void responder(String texto){
    String respuesta = (EsPalindromo(texto) == true) ? "Si":"No" ;
    System.out.println("¿Es palindromo?");
    System.out.println("...");
    System.out.println(respuesta);


    }
}
    

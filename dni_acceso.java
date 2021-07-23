/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dni_acceso;
import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

import java.util.*;
/**
 *
 * @author ElenaLago
 */
public class dni_acceso {
    private static final String letras ="TRWAGMYFPDXBNJZSQVHLCKE";
    
    public static char letraDNI(int dni){
        
        int resto = dni%23;
        return letras.charAt(resto);
        
    }
    
    private static boolean DNIvalido(String algo){
        if (algo.length()!=9)
            return false;
            for(int i =0; i<algo.length();i++)
                if(!Character.isDigit(algo.charAt(i))) 
                    return false;
           
//            char letra = letraDNI(algo.substring(0,8));
//            
//            return letra == algo.charAt(9);
//            
            return true;
        
        
    }
    
    public static void main(String args[]){
        
    	
    	Scanner non = new Scanner(System.in);
    	System.out.println("Cómo se llama?");
    	
        String nombre= non.nextLine();
        
    	Scanner non2 = new Scanner(System.in);
    	System.out.println("Cuál es su apellido?");
    	
        String apellido= non2.nextLine();
        
        
    	Scanner n = new Scanner(System.in);
    	System.out.println("Escribe los numeros del dni");
    	
        int num= n.nextInt();
        char letra=letraDNI(num);
        
       
        System.out.println("Bienvede "+" "+nombre+" "+apellido);
       
        System.out.println("Tu DNI es"+" "+num+letraDNI(num) );
    }
}

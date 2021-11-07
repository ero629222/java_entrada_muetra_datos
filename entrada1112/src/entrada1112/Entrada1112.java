/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada1112;

/**
 *
 * @author Leonardo Carnerp comisión #1112
 */
import java.util.Scanner;
public class Entrada1112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
         
        System.out.println("Bienvenido al sistema");
        
        String nombre = "";
        System.out.println("Ingrese su Nombre");
        nombre = entrada.nextLine();
        
        String apellido = "";
        System.out.println("Ingrese su Apellido");
        apellido = entrada.nextLine();
 
        System.out.println("Ingrese su Edad");
        int edad = entrada.nextInt();
        entrada.nextLine(); // aregada para resolver el tema de la lectura
        
        String pasatiempo = "";
        System.out.println("Ingrese su Hobbie");
        pasatiempo = entrada.nextLine();
        
        String editorC = "";
        System.out.println("Ingrese su Editor de código preferido");
        editorC = entrada.nextLine();
        
        String sistemaO = "";
        System.out.println("Ingrese su Sistema Operativo");
        sistemaO = entrada.nextLine();
        
    }
    
}

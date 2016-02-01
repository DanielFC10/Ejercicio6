/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Brandon Sema");
         System.out.println("Brandon Sema");
        Condon objeto = new Condon();
        objeto.setSabor("Chocolate");
        objeto.setTamano("XXL Mandingo");
        
        System.out.println("Andres Herrera");
        
        Computador objeto = new Computador();
        objeto.setProcesador("Intell");
        objeto.setMarca("Acer");
        
        System.out.println(objeto.getProcesador());
        System.out.println(objeto.getMarca());
        System.out.println(objeto.getSabor());
        System.out.println(objeto.getTamano());
    }
    
}

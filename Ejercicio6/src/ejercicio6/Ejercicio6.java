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
        System.out.println("Duvan Herrera");
        Perro objeto = new Perro();
        objeto.setRaza("Labrador");
        System.out.println(objeto.getRaza());
        System.out.println("Daniel Felipe Csstellanos");
        Kamasutra objeto = new Kamasutra();
        objeto.setPosicion("El helipcote en aterrizaje");
        System.out.println(objeto.getPosicion());
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

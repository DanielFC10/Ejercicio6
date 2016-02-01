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
        Perro objeto4 = new Perro();
        objeto4.setRaza("Labrador");

        System.out.println("Daniel Felipe Csstellanos");
        Kamasutra objeto3 = new Kamasutra();
        objeto3.setPosicion("El helipcote en aterrizaje");

        System.out.println("Andres Herrera");
        Computador objeto1 = new Computador();
        objeto1.setProcesador("Intell");
        objeto1.setMarca("Acer");

        System.out.println("Brandon Sema");
        Condon objeto = new Condon();
        objeto.setSabor("Chocolate");
        objeto.setTamano("XXL Mandingo");

        System.out.println(objeto4.getRaza());

        System.out.println(objeto3.getPosicion());

        System.out.println(objeto1.getProcesador());
        System.out.println(objeto1.getMarca());

        System.out.println(objeto.getSabor());
        System.out.println(objeto.getTamano());
    }

}

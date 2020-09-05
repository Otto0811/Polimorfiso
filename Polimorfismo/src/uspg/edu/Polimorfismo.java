/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author Otto
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tigre tigre=new Tigre("Tigre de Sumatra","Emperador","Carnivoro",6);
        tigre.Dato();
        tigre.habitat();
        tigre.estado();
        
        
        
        Guacamaya guaca=new Guacamaya("Guacamaya Azul","Pepe","Omnivoro",8);
        guaca.Mostrar();
        guaca.estado();
        guaca.habitat();
        
       
        
        
    }
    
}

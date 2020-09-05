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
public class Tigre extends Animal {

    private String subespecie;

    public Tigre(String subespecie, String nombre, String alimentacion, int edad) {
        super(nombre, alimentacion, edad);
        this.subespecie = subespecie;
    }
    public Tigre(String subespecie){
        
    }
    
    

    public String getSubespecie() {
        return subespecie;
    }

    public void setSubespecie(String subespecie) {
        this.subespecie = subespecie;
    }
    
    public void Dato(){
        System.out.println(getNombre()+"-"+getAlimentacion()+"-"+getEdad()+"años-n/"+getSubespecie());
    }
    
    
    @Override
    public void habitat() {
        System.out.println("Selvas en el continente asiatico");
    }

    @Override
    public void estado() {
        System.out.println("Libertad");
    }
    
}

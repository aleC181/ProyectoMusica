/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomusica;

/**
 *
 * @author alec
 */
public abstract class Coleccion {
   private String name;
   
   //constructoras
   public Coleccion(String name) {
        this.name = name;
        
    }
   
   //metodos

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public abstract float getDuracion();
    public abstract int cantElementos();
   @Override
    public abstract String toString();
    
}

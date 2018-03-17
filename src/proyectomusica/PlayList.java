/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomusica;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alec
 */
public class PlayList extends Coleccion {
    private List <Coleccion>cole;
    //constructor
    public PlayList(String nombre){
     super(nombre);
     cole=new ArrayList<Coleccion>();
    }
       
    //metodos
    
    public void agregar(Coleccion c){
       this.cole.add(c);
    }
    public void eliminar(Coleccion c){
        this.cole.remove(c);
    }
    
    @Override
    public float getDuracion(){
     float sum = 0;
     for(Coleccion c:this.cole){
         sum+=c.getDuracion();
     }
     return sum;
    }
    @Override
    public int cantElementos(){
        return cole.size();
    }
    @Override 
    public String toString(){
    //imprime los datos de una PlayList
    String concat1="";
    for(Coleccion c:this.cole){
      //System.out.println(c.toString());  //imprime cada PlayList separadamente
      concat1 = concat1+c.toString();
     }
    return concat1;//devuelve toda la PlayList concatenada
    }
    
   
}

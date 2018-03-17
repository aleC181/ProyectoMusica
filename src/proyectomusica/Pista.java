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
public class Pista extends Coleccion{
   private int id;
   private float duracion;
   private String artista;
   private String tituloAlbum;
   private int anio;
   private String genero;
   //constructoras
   public Pista(int id, String nombre,float duracion,String artista, String tituloAlbum, int anio, String genero) {
        super(nombre);
        this.id = id;
        this.duracion=duracion;
        this.artista = artista;
        this.tituloAlbum = tituloAlbum;
        this.anio = anio;
        this.genero = genero;
    }
   public Pista() {
        super("");
        this.id = 1;
        this.duracion=0;
        this.artista = "";
        this.tituloAlbum = "";
        this.anio = 0;
        this.genero = "";
    }
   //metodos

    public int getId() {
        return this.id;
    }

    public String getArtista() {
        return this.artista;
    }
@Override
    public float getDuracion() {
        return this.duracion;
    }

    public String getTituloAlbum() {
        return this.tituloAlbum;
    }

    public int getAnio() {
        return this.anio;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public void setTituloAlbum(String tituloAlbum) {
        this.tituloAlbum = tituloAlbum;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public int cantElementos(){
        return 1;
    }
   @Override 
   public String toString(){
   //imprime los datos de una pista
    return("id "+this.id+" "+"Nombre: "+super.getName()+" "+"Duración: "+this.duracion+" "+"Artista: "+this.artista+" "+"Título Album: "+this.tituloAlbum+" "+"Anio: "+this.anio+" "+"Género: "+this.genero);
    }
   
}

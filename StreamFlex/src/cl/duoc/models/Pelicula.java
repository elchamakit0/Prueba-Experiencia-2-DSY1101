/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Pelicula extends Contenido {
    private String duracion;
    private double calificacion;
    public List peliculas;

    private Pelicula() {
    }

    public Pelicula(int id, String nombre) {
        super(id, nombre);
    }
    
    public Pelicula(String duracion, double calificacion, int id, String nombre) {
        super(id, nombre);
        this.duracion = duracion;
        this.calificacion = calificacion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public List getPeliculas() {
        return peliculas;
    }


    public void setPeliculas(List peliculas) {
        this.peliculas = peliculas;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre()+" Id: " + super.getId() + " Duracion: " + duracion + ", Calificacion: " + calificacion + '}';
    }

    
    //El método crearXXXX comprueba por si mismo que su código no se repita.
    public void crearPelicula(String nombre, List peliculas, int rate, String dur) {
        Pelicula d1 = new Pelicula();
        peliculas.add(d1);
        int idset;
        idset = peliculas.size();
        d1.setId(idset);
        d1.setNombre(nombre);
        d1.setCalificacion(rate);
        d1.setDuracion(dur);
    }
    
    public void listarPeliculas(List peliculas){
        for(int i =0; i<peliculas.size(); i++){
            System.out.println(peliculas.get(i));
        }
    }
}

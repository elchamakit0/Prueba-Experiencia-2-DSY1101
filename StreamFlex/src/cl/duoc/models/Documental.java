/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Documental extends Contenido {
    private String enfoqueEducativo;
    private int duracion;
    private List documentales;

    private Documental() {
    }
    
    public Documental(int id, String nombre) {
        super(id, nombre);
    }

    public Documental(String enfoqueEducativo, int duracion, List documentales, int id, String nombre) {
        super(id, nombre);
        this.enfoqueEducativo = enfoqueEducativo;
        this.duracion = duracion;
        this.documentales = documentales;
    }

    public String getEnfoqueEducativo() {
        return enfoqueEducativo;
    }

    public List getDocumentales() {
        return documentales;
    }

    public void setDocumentales(List documentales) {
        this.documentales = documentales;
    }

    public void setEnfoqueEducativo(String enfoqueEducativo) {
        this.enfoqueEducativo = enfoqueEducativo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + super.getNombre()+" Id: " + super.getId() + " Enfoque Educativo: " + enfoqueEducativo + ", Duracion (minutos): " + duracion + '}';
    }

    //El método crearXXXX comprueba por si mismo que su código no se repita.
    public void crearDocumental(String nombre, List documentales, String enE, int dur) {
        Documental d1 = new Documental();
        documentales.add(d1);
        int idset;
        idset = documentales.size();
        d1.setId(idset);
        d1.setNombre(nombre);   
        d1.setEnfoqueEducativo(enE);
        d1.setDuracion(dur);
    }
    
    public void listarDocumentales(List documentales){
        for(int i =0; i<documentales.size(); i++){
            System.out.println(documentales.get(i));
        }
    }
    
}

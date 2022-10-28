/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author marco
 */

@Entity
@Table(name = "peliculas")

public class Pelicula implements Serializable {
    
    @Id_pelicula
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_pelicula;
    private String nombre_pelicula;
    private long costo_pelicula;
    private String fecha;
    
    public long getId_pelicula() {
        return id_pelicula;
    }

    public void setId(long id_pelicula) {
        this.id_pelicula = id_pelicula;
    }
    
    public String getNombre_pelicula() {
        return nombre_pelicula;
    }

    public void setNombre_pelicula(String nombre_pelicula) {
        this.nombre_pelicula = nombre_pelicula;
    }
    
    public long getCosto_pelicula() {
        return costo_pelicula;
    }

    public void setCosto_pelicula(long costo_pelicula) {
        this.costo_pelicula = costo_pelicula;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author marco
 */

@Entity
@Table(name = "sala")

public class Sala implements Serializable {
    @Num_sala
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long num_sala;
    private long capacidad_max;
    private long id_pelicula_fk;
    
    @ManyToOne
    @JoinColumn(name="id_pelicula_fk")
    private Pelicula pelicula;

        
    public long getNum_sala() {
        return num_sala;
    }

    public void setNum_sala(long num_sala) {
        this.num_sala = num_sala;
    }
    
        public long getCapacidad_max() {
        return capacidad_max;
    }

    public void setCapacidad_max(long capacidad_max) {
        this.capacidad_max = capacidad_max;
    }
    
    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
}

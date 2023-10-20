/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author mario
 */

@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Long idProducto;
    
    private String descripcion;
    private String rutaImagen;
    private Boolean activo;
    
    public Producto(){
        
    }

    public Producto(String descripcion, Boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
}

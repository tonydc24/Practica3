
package com.practica.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "arbol")
public class Arbol implements Serializable{ 
    private static final long serialVersionUID= 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)  
    @Column (name="id_arbol")
    
    
    private long idArbol;
    private String rutaImagen;
    private String nombreComun;
    private long altura;
    private String tipoFlor;
    

    public Arbol() {
    }

    public Arbol(String nombreComun, long altura, String tipoFlor) {
        this.nombreComun = nombreComun;
        this.altura = altura;
        this.tipoFlor = tipoFlor;
    }

    
    
    
}

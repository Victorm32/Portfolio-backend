
package com.portfolio.backendportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String institucion;
    private String carrera;
    private String urlFoto;

    public Educacion() {
    }

    public Educacion(Long id, String institucion, String carrera) {
        this.id = id;
        this.institucion = institucion;
        this.carrera = carrera;
    }
    
     
}

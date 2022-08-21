
package com.portfolio.backendportfolio.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String user;
    private String password;
    private String nombreYApellido;
    private String puesto;
    private String direccion;
    private String acercaDe;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Experiencia> experiencias = new ArrayList<>(); 
    @OneToMany(cascade = CascadeType.ALL)
    private List<Educacion> educacion = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL)
    private List<Skill> skill = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL)
    private List<Proyecto> proyecto = new ArrayList<>();     

    public Persona() {
    }

    public Persona(Long id, String nombreyapellido, String puesto, String direccion, String acercaDe, String user, String password) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.nombreYApellido = nombreyapellido;
        this.puesto = puesto;
        this.direccion = direccion;
        this.acercaDe = acercaDe;
    }
    
    
    
    
}

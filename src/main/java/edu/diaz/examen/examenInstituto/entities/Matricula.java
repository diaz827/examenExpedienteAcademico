package edu.diaz.examen.examenInstituto.entities;

import java.time.LocalDate;

import edu.diaz.examen.examenInstituto.enumerate.Enumerado;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "matriculas")
public class Matricula {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matricula")
    private long id;

    @Column (name = "fechaMatriculacion", nullable = false)
    private LocalDate fechaMatriculacion;

    @Column (name = "calificacion", nullable = true)
    private Double calificacion;

    @Enumerated (EnumType.STRING)
    private Enumerado enumerado;

    public Matricula() {
    }

    public Matricula(LocalDate fechaMatriculacion, Double calificacion, Enumerado enumerado) {
        this.fechaMatriculacion = fechaMatriculacion;
        this.calificacion = calificacion;
        this.enumerado = enumerado;
    }

    
}

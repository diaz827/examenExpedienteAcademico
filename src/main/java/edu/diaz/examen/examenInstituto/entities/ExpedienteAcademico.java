package edu.diaz.examen.examenInstituto.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "expedientesAcademicos")
public class ExpedienteAcademico {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_expedienteAcademico")
    private long id;

    @Column (name = "numeroExpediente", nullable = false, unique = true)
    private String numeroExpediente;

    @Column (name = "fechaApertura", nullable = false)
    private LocalDate fechaApertura;

    @Column (name = "notaMediaAcceso", nullable = false)
    private Double notaMediaAcceso;

    public ExpedienteAcademico() {
    }

    public ExpedienteAcademico(String numeroExpediente, LocalDate fechaApertura, Double notaMediaAcceso) {
        this.numeroExpediente = numeroExpediente;
        this.fechaApertura = fechaApertura;
        this.notaMediaAcceso = notaMediaAcceso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(String numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Double getNotaMediaAcceso() {
        return notaMediaAcceso;
    }

    public void setNotaMediaAcceso(Double notaMediaAcceso) {
        this.notaMediaAcceso = notaMediaAcceso;
    }

    
}   

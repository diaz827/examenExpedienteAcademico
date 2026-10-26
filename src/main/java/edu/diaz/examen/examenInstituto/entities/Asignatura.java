package edu.diaz.examen.examenInstituto.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "asignaturas")
public class Asignatura {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignatura")
    private long id;

    @Column (name = "nombre", nullable = false)
    private String nombre;

    @Column (name = "creditos", nullable = false)
    private int creditos;

    @Column (name = "nombre", unique = false,nullable = false)
    private String nombre;

}

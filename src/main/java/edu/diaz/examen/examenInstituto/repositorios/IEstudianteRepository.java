package edu.diaz.examen.examenInstituto.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.diaz.examen.examenInstituto.entities.Estudiante;

public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {

}

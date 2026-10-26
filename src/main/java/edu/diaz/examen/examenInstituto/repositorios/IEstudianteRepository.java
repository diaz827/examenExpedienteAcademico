package edu.diaz.examen.examenInstituto.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.diaz.examen.examenInstituto.entities.Estudiante;
import java.util.List;
import java.util.Optional;


public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {

Optional<Estudiante> findByIdDniOptional(String DNI);

}

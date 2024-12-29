package aluracursos.apirest_foroAlura.domain.topico;

import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.Optional;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    Page<Topico> findByCursoOrderByFechaDeCreacionAsc(String cursoNombre, Pageable pageable);

}

package aluracursos.apirest_foroAlura.controllers;

import aluracursos.apirest_foroAlura.domain.topico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.Stream;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/topicos")
public class TopicoControllers {

    @Autowired
   private TopicoRepository topicoRepository;

    @PostMapping
    @Transactional
    public  void registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico){
        topicoRepository.save(new Topico(datosRegistroTopico));
    }

    @GetMapping
    public Page<DatosListadoTopico> listadoTopicos(
            @RequestParam(required = false) String curso,
            @PageableDefault(size = 10, sort = "fechaDeCreacion", direction = Sort.Direction.ASC)
            org.springframework.data.domain.Pageable paginacion) {

        if (curso != null) {
            // Filtra por curso y ordena por fecha
            return topicoRepository.findByCursoOrderByFechaDeCreacionAsc(curso, paginacion)
                    .map(DatosListadoTopico::new);
        }
       /* if (!cursoRepository.existsByNombre(curso)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El curso no existe");
        }*/


        // Si no hay filtro, muestra todos los tópicos ordenados por fecha
        return topicoRepository.findAll(paginacion).map(DatosListadoTopico::new);
    }

    @GetMapping("/{id}")
    public DatosListadoTopico buscarTopicoPorId(@PathVariable Long id) {
        Topico topico = topicoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tópico no encontrado con el ID: " + id));
        return new DatosListadoTopico(topico);
    }

    @PutMapping
    @Transactional
    public void  actualizarTopico(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico) {
        // Verificar si el tópico existe en la base de datos
        /*if (!topicoRepository.findById(id).isPresent()) {
            throw new RuntimeException("Tópico no encontrado con el ID: " + id);
        }*/
        Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
        topico.actualizarTopico(datosActualizarTopico);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarMedico(@PathVariable Long id) {
      Topico topico = topicoRepository.getReferenceById(id);
      topicoRepository.delete(topico);
  }
}





   /* @GetMapping
    public Page<DatosListadoTopico> listadoTopicos(@PageableDefault(size = 10, sort = "fechaDeCreacion" "curso", direction = Sort.Direction.ASC) org.springframework.data.domain.Pageable paginacion) {
             return topicoRepository.findAll(paginacion).map(DatosListadoTopico::new);
    }*/





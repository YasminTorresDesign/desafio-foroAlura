package aluracursos.apirest_foroAlura.domain.topico;

import java.time.LocalDateTime;

public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaDeCreacion,
        String status,
        Cursos curso
) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaDeCreacion(), topico.getStatus(), topico.getCurso());
    }

    @Override
    public Long id() {
        return id;
    }

    @Override
    public String titulo() {
        return titulo;
    }

    @Override
    public String mensaje() {
        return mensaje;
    }

    @Override
    public LocalDateTime fechaDeCreacion() {
        return fechaDeCreacion;
    }

    @Override
    public String status() {
        return status;
    }

    @Override
    public Cursos curso() {
        return curso;
    }
}

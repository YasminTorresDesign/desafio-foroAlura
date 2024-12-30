package aluracursos.apirest_foroAlura.domain.topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        Long id,

        String titulo,

        String mensaje,
        LocalDateTime fechaDeCreacion,

        Cursos curso

) {
}

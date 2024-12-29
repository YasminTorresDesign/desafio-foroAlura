package aluracursos.apirest_foroAlura.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank(message = "Titulo es obligatorio")
        String titulo,
        @NotBlank(message = "Mensaje es obligatorio")
        String mensaje,
        @NotNull
        Cursos curso

) {
}

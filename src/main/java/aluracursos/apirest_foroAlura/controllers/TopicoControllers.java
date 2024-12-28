package aluracursos.apirest_foroAlura.controllers;

import aluracursos.apirest_foroAlura.domain.topico.DatosRegistroTopico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoControllers {

    @PostMapping
    public  void registrarTopico(@RequestBody DatosRegistroTopico datosRegistroTopico){
        System.out.println(datosRegistroTopico);
    }


}

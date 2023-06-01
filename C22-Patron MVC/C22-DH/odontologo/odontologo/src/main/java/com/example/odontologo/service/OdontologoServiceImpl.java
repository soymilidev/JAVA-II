package com.example.odontologo.service;

import com.example.odontologo.domain.Odontologo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class OdontologoServiceImpl implements OdontologoService {
    @Override
    public List<Odontologo> listaOdontologos() {
        return Arrays.asList(new Odontologo("Javier"), new Odontologo("Ramon"));
    }
}

//La anotación @Service le dice a Spring que es un servicio. Allí, vemos como
//listaOdontologos está hardcodeando. Esto sucede agregando de manera manual los
//datos.
//En una aplicación tenés que ir a la capa de DAO para devolverlo desde una base de
//datos, por ejemplo.
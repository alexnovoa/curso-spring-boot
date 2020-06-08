package com.curso.springapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping
    public String saludar(@PathVariable String nombre){
        return "Hola "+nombre;

    }  

    @GetMapping("/cerrar")
    public String cerrarSesion(){
        return "Sesion terminanda";

    }
    
}
package com.cibertec.Proyecto.Clinica.presentation.controller;


import com.cibertec.Proyecto.Clinica.domain.model.Especialidad;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hellow")
public class HellowController {

    @GetMapping
    public ResponseEntity<String> hellow() {
        return ResponseEntity.ok("Hola mundo");
    }
}

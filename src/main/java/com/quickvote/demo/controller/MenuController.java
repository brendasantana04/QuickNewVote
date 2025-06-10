package com.quickvote.demo.controller;

import com.quickvote.demo.service.*;
import com.quickvote.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class    MenuController {

    @Autowired
    private ClasseMetodos classeMetodos;

    @PostMapping("/eleitor")
    public String cadastraEleitor(@RequestBody Eleitor eleitor) {
        classeMetodos.cadastraEleitor(eleitor);
        return "Eleitor cadastrado com sucesso.";
    }

    @GetMapping("/eleitor")
    public List<Eleitor> listarEleitores() {
        return classeMetodos.listarEleitores();
    }
}

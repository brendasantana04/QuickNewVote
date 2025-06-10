package com.quickvote.demo.controller;

import com.quickvote.demo.model.Eleitor;
import com.quickvote.demo.repository.EleitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Controller
@RequestMapping("/eleitor")
public class EleitorController {

    @Autowired
    private EleitorRepository eleitorRepository;

    @GetMapping
    public List<Eleitor> listar() {
        return eleitorRepository.findAll();
    }

    @PostMapping
    public Eleitor salvar(@RequestBody Eleitor eleitor) {
        return eleitorRepository.save(eleitor);
    }

}
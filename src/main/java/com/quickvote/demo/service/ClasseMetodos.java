package com.quickvote.demo.service;

import org.springframework.stereotype.Service;
import com.quickvote.demo.model.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClasseMetodos {

    private final List<Eleitor> eleitores = new ArrayList<>();

    public void cadastraEleitor(Eleitor e) {
        eleitores.add(e);
    }

    public List<Eleitor> listarEleitores() {
        return eleitores;
    }
}


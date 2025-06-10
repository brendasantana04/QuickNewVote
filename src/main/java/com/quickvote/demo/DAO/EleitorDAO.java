package com.quickvote.demo.DAO;

import com.quickvote.demo.conexao.conexao;
import com.quickvote.demo.model.Eleitor;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class EleitorDAO {

    public void cadastrarEleitor(Eleitor Eleitor) {

        String sql = "INSERT INTO eleitor (numeroEleitor, nomeEleitor, numeroSessao) VALUES (?, ?, ?)";

        PreparedStatement ps = null;

    }
}

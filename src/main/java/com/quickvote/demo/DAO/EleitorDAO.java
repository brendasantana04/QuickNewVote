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

        try {
            ps = Objects.requireNonNull(conexao.getConexao()).prepareStatement(sql);
            ps.setInt(1, Eleitor.getNumeroEleitor());
            ps.setString(2, Eleitor.getNomeEleitor());
            ps.setInt(3, Eleitor.getNumeroSessao());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}

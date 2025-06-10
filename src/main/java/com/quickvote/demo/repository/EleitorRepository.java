package com.quickvote.demo.repository;

import com.quickvote.demo.model.Eleitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface EleitorRepository extends JpaRepository<Eleitor, Long> {

    List<Eleitor> findByNomeEleitorContaining(String nomeEleitor);


}

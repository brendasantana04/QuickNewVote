package com.quickvote.demo;

import com.quickvote.demo.DAO.EleitorDAO;
import com.quickvote.demo.model.Eleitor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickvoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickvoteApplication.class, args);

		Eleitor e = new Eleitor();

		new EleitorDAO().cadastrarEleitor(e);

	}

}

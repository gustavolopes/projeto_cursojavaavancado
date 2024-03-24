package br.cnj.projeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.cnj.projeto.util.CasoJudicial;

@SpringBootApplication
public class ProjetoApplication implements CommandLineRunner {
	@Autowired
	private CasoJudicial caso;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		double resposta = caso.finalizarCusto(100, "RJ", 2025);
		System.out.println(resposta);
	}

}

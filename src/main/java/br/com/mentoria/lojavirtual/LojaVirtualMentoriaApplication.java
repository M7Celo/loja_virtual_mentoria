package br.com.mentoria.lojavirtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "br.com.lojavirtualmentoria.loja_virtual_mentoria.domain.model")
public class LojaVirtualMentoriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaVirtualMentoriaApplication.class, args);
	}

}

package org.frb.stls.hack.hackservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.inject.Inject;

@SpringBootApplication
public class HackServiceApplication {

	@Inject
	private GameService gameservice;
	public static void main(String[] args) {
		SpringApplication.run(HackServiceApplication.class, args);
	}

}

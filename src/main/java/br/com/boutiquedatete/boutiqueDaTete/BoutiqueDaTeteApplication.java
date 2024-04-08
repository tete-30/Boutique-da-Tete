package br.com.boutiquedatete.boutiqueDaTete;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class BoutiqueDaTeteApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoutiqueDaTeteApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void init() {
		System.out.println("Conectou!");
	}

}


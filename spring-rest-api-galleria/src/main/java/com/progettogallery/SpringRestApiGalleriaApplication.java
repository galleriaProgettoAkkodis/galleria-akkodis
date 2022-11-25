package com.progettogallery;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.progettogallery.entities.Galleria;
import com.progettogallery.entities.Immagine;
import com.progettogallery.services.GalleriaService;
import com.progettogallery.services.ImmagineService;

@SpringBootApplication
public class SpringRestApiGalleriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiGalleriaApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(ImmagineService imgS, GalleriaService gallS) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				Immagine i = new Immagine();
				i.setTitolo("opera d'arte");
				i.setUrl("aaaaa");
				Galleria g = new Galleria();
				g.setTitolo("museo aa");
				i.setGalleria(g);
				gallS.save(g);
				imgS.save(i);
				
			}
		};
	}
	
}

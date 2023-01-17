package data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import daos.BookRepository;
import models.Book;

@Configuration
public class LoadTestData {
	
	private static final Logger log = LoggerFactory.getLogger(LoadTestData.class);
	
	@Bean
	CommandLineRunner initDatabase(BookRepository repository) {
		return args -> {
			log.info("Preloading" + repository.save(new Book("The Hobbit", "Tolkien", "location")));
		};
	}

}

package com.jpa.queryprojectionjpa;

import com.jpa.queryprojectionjpa.model.Author;
import com.jpa.queryprojectionjpa.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QueryprojectionjpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(QueryprojectionjpaApplication.class, args);
	}
	@Autowired
	AuthorRepository authorRepository;
	@Override
	public void run(String... args) throws Exception {
		Author author1 = new Author("Abebe", "Balcha");
		authorRepository.save(author1);
		System.out.println(authorRepository.findViewByFirstName("Alex").toString());
	}
}

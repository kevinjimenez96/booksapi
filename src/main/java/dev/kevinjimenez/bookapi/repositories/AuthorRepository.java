package dev.kevinjimenez.bookapi.repositories;

import dev.kevinjimenez.bookapi.dtos.AuthorDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<AuthorDTO, String> {
}

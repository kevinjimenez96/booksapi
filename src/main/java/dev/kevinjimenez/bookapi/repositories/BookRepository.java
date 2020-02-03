package dev.kevinjimenez.bookapi.repositories;

import dev.kevinjimenez.bookapi.dtos.BookDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository  extends MongoRepository<BookDTO, String> {
}

package dev.kevinjimenez.bookapi.repositories;

import dev.kevinjimenez.bookapi.dtos.AuthorDTO;
import dev.kevinjimenez.bookapi.dtos.BookDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository  extends MongoRepository<BookDTO, String> {
    List<BookDTO> findByAuthor(AuthorDTO authorDTO);
}
